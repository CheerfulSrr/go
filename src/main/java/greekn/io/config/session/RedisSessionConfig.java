package greekn.io.config.session;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.DefaultCookieSerializer;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;

/**
 * <p>
 * redis session config
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-18 16:57
 * @package: greekn.io.config.session
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@EnableRedisHttpSession
public class RedisSessionConfig {

    /**
     * 请求头认证
     *
     * @return HttpSessionIdResolver
     */
    @Bean
    public HttpSessionIdResolver httpSessionIdResolver() {
        return HeaderHttpSessionIdResolver.xAuthToken();
    }

    /**
     * 默认cookie配置
     * 目前使用请求头认证，所以此配置无用
     *
     * @return DefaultCookieSerializer
     */
    @Bean
    public DefaultCookieSerializer getDefaultCookieSerializer() {
        DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();
        defaultCookieSerializer.setDomainName("go.greekn.io");
        defaultCookieSerializer.setUseSecureCookie(true);
        defaultCookieSerializer.setUseBase64Encoding(false);
        return defaultCookieSerializer;
    }

    /**
     * 替代spring session默认的{@link JdkSerializationRedisSerializer}
     *
     * @return RedisSerializer
     */
    @Bean
    public RedisSerializer<Object> springSessionDefaultRedisSerializer() {
        return new Jackson2JsonRedisSerializer(Object.class);
    }

}
