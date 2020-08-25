package greekn.io;

import greekn.io.config.ApplicationContextConfig;
import greekn.io.config.security.WebSecurityConfig;
import greekn.io.config.session.RedisSessionConfig;
import greekn.io.config.web.WebMvcConfig;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.Filter;

/**
 * <p>
 * 测试基类
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-08 19:31
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { ApplicationContextConfig.class, WebSecurityConfig.class, WebMvcConfig.class, RedisSessionConfig.class })
public class TestApplicationBase {


    protected MockMvc mvc;
    protected CacheManager cacheManager;
    @Autowired
    private WebApplicationContext context;
    @Autowired
    private Filter springSecurityFilterChain;

    @Before
    public void setup() {
        mvc = MockMvcBuilders.webAppContextSetup(context)
                .addFilter(springSecurityFilterChain)
                .apply(SecurityMockMvcConfigurers.springSecurity())
                .build();
        cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
                .build(true);
    }

}
