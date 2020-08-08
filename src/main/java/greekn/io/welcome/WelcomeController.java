package greekn.io.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-07-26 13:35
 * @package: greekn.io.welcome
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
