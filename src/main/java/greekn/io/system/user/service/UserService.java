package greekn.io.system.user.service;

import greekn.io.system.user.UserEntity;
import greekn.io.system.user.vo.LoginRequest;
import org.springframework.cache.annotation.Cacheable;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-21 16:31
 * @package: greekn.io.system.user.service
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public interface UserService {

    UserEntity getUser(String username, String password);

    UserEntity getUser(String username);

    UserEntity getUser(LoginRequest loginRequest);

}
