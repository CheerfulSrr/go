package greekn.io.system.auth.service;

import greekn.io.system.user.vo.LoginRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-25 14:42
 * @package: greekn.io.system.auth.service
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public interface SessionService {

    /**
     * 根据用户名查找session
     *
     * @param loginRequest {@link LoginRequest}
     * @return String
     */
    List<String> findSessionIdByRequest(LoginRequest loginRequest);

    List<String> findSessionIdByRequest(String username);

    boolean existSessionId(HttpServletRequest request);

    /**
     * 根据用户名判断session id是否存在
     *
     * @param loginRequest
     * @return
     */
    boolean existSessionId(LoginRequest loginRequest);

    /**
     * 创建新session
     *
     * @param loginRequest {@link LoginRequest}
     * @return this
     */
    SessionService createSession(LoginRequest loginRequest);

    /**
     * 持久化session id
     *
     * @param request  {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @return this
     */
    SessionService setSessionId(HttpServletRequest request, HttpServletResponse response);

}
