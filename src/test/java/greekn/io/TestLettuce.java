package greekn.io;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-18 17:12
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestLettuce extends TestApplicationBase {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void t1() {
        String a = redisTemplate.opsForValue().get("a");
        Assert.assertEquals("1", a);
    }

    @Test
    public void t2() {
        redisTemplate.opsForValue().set("b", "1111");
        String b = redisTemplate.opsForValue().get("b");
        Assert.assertEquals("1111", b);
    }


}
