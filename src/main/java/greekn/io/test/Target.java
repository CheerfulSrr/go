package greekn.io.test;

import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-08 21:04
 * @package: greekn.io.test
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Component
public class Target implements TargetInterface {

    @Override
    public void save() {
        System.out.println("save...");
    }

}
