package greekn.io;

import greekn.io.system.user.UserEntity;
import greekn.io.system.user.service.UserService;
import org.ehcache.Cache;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-24 15:24
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestCache extends TestApplicationBase {

    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testCacheable() {
        String encodePassword = passwordEncoder.encode("test1");
        //UserEntity entity = userService.getUser("test1", encodePassword);
    }

}
