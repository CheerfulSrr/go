package greekn.io;

import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-18 09:39
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestSql extends TestApplicationBase {

    @Test
    @Sql(
            scripts = "/user.sql",
            config = @SqlConfig(separator = ";")
    )
    public void test1() {

    }

}
