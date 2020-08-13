package greekn.io;

import greekn.io.config.WebMvcConfig;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
@ContextConfiguration(classes = { WebMvcConfig.class})
@Ignore
public class TestApplication {
}
