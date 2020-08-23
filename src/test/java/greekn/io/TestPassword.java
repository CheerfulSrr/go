package greekn.io;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-16 16:09
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestPassword extends TestApplicationBase {

    @Test
    public void test1(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String s = encoder.encode("test3");
        System.out.println(s);
        encoder.matches("test33",s);
    }

}
