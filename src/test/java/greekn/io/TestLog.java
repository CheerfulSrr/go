package greekn.io;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import greekn.io.test.Target;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-10 21:18
 * @package: greekn.io
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class TestLog {

    @Test
    public void test1() {
        Logger logger = LoggerFactory.getLogger(TestLog.class);
        logger.debug("hello");
        LoggerContext iLoggerFactory = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(iLoggerFactory);
        Target target = new Target();
        target.save();
    }

}
