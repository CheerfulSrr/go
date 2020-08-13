package greekn.io.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-14 22:13
 * @package: greekn.io.config
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Configuration
@ComponentScan(
        basePackages = "greekn.io"
        , excludeFilters = @ComponentScan.Filter(classes = Controller.class)
)
public class ApplicationContextConfig {
}
