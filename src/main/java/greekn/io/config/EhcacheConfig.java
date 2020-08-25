package greekn.io.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.cache.jcache.JCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * <p>
 * ehcache3 config integration with spring5
 * 1. ehcache3默认实现了{@link javax.cache.CacheManager}, 引用时需要在maven中引入java.cache:cache-api
 * 2. ehcache3的groupId为org.ehcache
 * 3. 与spring整合时, 需使用{@link JCacheCacheManager}. {@link EhCacheCacheManager}仅支持ehcache2
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-24 16:09
 * @package: greekn.io.config
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EnableCaching
@Configuration
public class EhcacheConfig {

    @Bean
    public JCacheCacheManager cacheManager() throws IOException {
        JCacheCacheManager cacheManager = new JCacheCacheManager();
        cacheManager.setCacheManager(jCacheManagerFactoryBean().getObject());
        return cacheManager;
    }

    private JCacheManagerFactoryBean jCacheManagerFactoryBean() throws IOException {
        JCacheManagerFactoryBean jCacheManagerFactoryBean = new JCacheManagerFactoryBean();
        jCacheManagerFactoryBean.setCacheManagerUri(new ClassPathResource("ehcache.xml").getURI());
        jCacheManagerFactoryBean.afterPropertiesSet();
        return jCacheManagerFactoryBean;
    }

}
