package greekn.io.system.auth.service.impl;

import greekn.io.system.auth.service.SessionService;
import greekn.io.system.user.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;
import org.springframework.session.web.http.HttpSessionIdResolver;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * session操作相关service
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-25 14:17
 * @package: greekn.io.common
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private FindByIndexNameSessionRepository<? extends Session> findByIndexNameSessionRepository;
    @Autowired
    private HttpSessionIdResolver httpSessionIdResolver;
    private String sessionId = null;

    @Override
    public List<String> findSessionIdByRequest(LoginRequest loginRequest) {
        return findSessionIdByRequest(loginRequest.getName());
    }

    @Override
    public List<String> findSessionIdByRequest(String username) {
        Map<String, ? extends Session> map = findByIndexNameSessionRepository.findByPrincipalName(username);
        if (!map.isEmpty()) {
            return new ArrayList<>(map.keySet());
        }
        return new ArrayList<>(0);
    }

    @Override
    public boolean existSessionId(HttpServletRequest request) {
        return true;
    }

    @Override
    public boolean existSessionId(LoginRequest loginRequest) {
        return !findSessionIdByRequest(loginRequest).isEmpty();
    }

    @Override
    public SessionService createSession(LoginRequest loginRequest) {
        Session session = sessionRepository.createSession();
        session.setAttribute(FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME, loginRequest.getName());
        sessionRepository.save(session);
        sessionId = session.getId();
        return this;
    }

    @Override
    public SessionService setSessionId(HttpServletRequest request, HttpServletResponse response) {
        httpSessionIdResolver.setSessionId(request, response, this.sessionId);
        this.sessionId = null;
        return this;
    }

}
