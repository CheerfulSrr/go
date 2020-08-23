package greekn.io.system.user.controller;

import greekn.io.system.user.UserEntity;
import greekn.io.system.user.service.UserService;
import greekn.io.system.user.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;
import org.springframework.session.web.http.HttpSessionIdResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-16 11:41
 * @package: greekn.io.system.user.controller
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("/api/sys")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private HttpSessionIdResolver sessionIdResolver;
    @Autowired
    private HttpSessionIdResolver HttpSessionIdResolver;
    @Autowired
    private UserService userService;

    // todo {@link RequestCache}

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
        Session session = sessionRepository.createSession();
        UserEntity user = userService.getUser(loginRequest);
        session.setAttribute(FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME, loginRequest.getName());
        sessionRepository.save(session);
        HttpSessionIdResolver.setSessionId(request, response, session.getId());
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getName(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "success";
    }

    @PostMapping("/register")
    public String register() {
        return "";
    }

    @GetMapping("/logout")
    public String logout() {
        return "";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(HttpSession session, HttpServletRequest request) {
        List<String> strings = sessionIdResolver.resolveSessionIds(request);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Enumeration<String> attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String s = attributeNames.nextElement();
            System.out.println(s);
        }
        return "ok";
    }

    @GetMapping("/test3")
    @ResponseBody
    public String test1(HttpServletRequest request) {
        sessionIdResolver.resolveSessionIds(request);
        return "ok2";
    }


}
