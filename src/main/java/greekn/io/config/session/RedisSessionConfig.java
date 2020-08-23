package greekn.io.config.session;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.DefaultCookieSerializer;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;

import java.time.Duration;

/**
 * <p>
 *
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

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        return new LettuceConnectionFactory(standaloneConfiguration(), clientConfiguration());
    }

    /**
     * 请求头认证
     *
     * @return HttpSessionIdResolver
     */
    @Bean
    public HttpSessionIdResolver httpSessionIdResolver() {
        return HeaderHttpSessionIdResolver.xAuthToken();
    }

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

    @Bean
    public RedisTemplate<String, String> redisTemplate(LettuceConnectionFactory connectionFactory) {
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setConnectionFactory(connectionFactory);
        redisTemplate.setDefaultSerializer(stringRedisSerializer);
        return redisTemplate;
    }

    private RedisStandaloneConfiguration standaloneConfiguration() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
        configuration.setHostName("101.37.83.15");
        configuration.setPort(49703);
        configuration.setPassword("CHE$0827.&");
        return configuration;
    }

    private LettuceClientConfiguration clientConfiguration() {
        return LettuceClientConfiguration.builder().commandTimeout(Duration.ofSeconds(30)).build();
    }

}
