package greekn.io.config;

import greekn.io.system.user.UserEntity;
import greekn.io.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-16 19:05
 * @package: greekn.io.config
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Component
public class AuthorityService {

    @Autowired
    private UserService userService;
    @Autowired
    private SessionRepository sessionRepository;

    public boolean checkUserInfo(HttpServletRequest request, Authentication authentication) {
        Session sessionId = sessionRepository.findById(request.getSession().getId());
        String indexName = sessionId.getAttribute(FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME);
        UserEntity user = userService.getUser(indexName);
        authentication = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        //new HttpSessionRequestCache().saveRequest(request, response);
        if (user != null) {
            return true;
        }
        return false;
    }

}
