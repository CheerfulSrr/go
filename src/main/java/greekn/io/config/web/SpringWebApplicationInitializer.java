package greekn.io.config.web;

import greekn.io.config.ApplicationContextConfig;
import greekn.io.config.security.WebSecurityConfig;
import greekn.io.config.session.RedisSessionConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <p>
 * web initializer
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-10 13:41
 * @package: greekn.io.config
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class SpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ ApplicationContextConfig.class, WebSecurityConfig.class, RedisSessionConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ WebMvcConfig.class };
    }

    /**
     * DispatchServlet映射
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }
}
