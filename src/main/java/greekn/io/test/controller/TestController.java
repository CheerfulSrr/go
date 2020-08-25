package greekn.io.test.controller;

import greekn.io.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-14 22:16
 * @package: greekn.io.test.controller
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/i1")
    public String c1(HttpSession httpSession) {
        httpSession.setAttribute("test", "testsession");
        return "success";
    }

    @GetMapping("/i3")
    public String c2(HttpSession session) {
        String test = (String) session.getAttribute("test");
        if (test != null) {
            return test;
        }
        return "session null";
    }

    @GetMapping("/i2")
    public String c3(HttpSession session) {
        session.removeAttribute("test");
        return "clear";
    }

    @GetMapping("/t1")
    public String t1() {
        userService.getUser("test1", "test2");
        return "t1";
    }

}
