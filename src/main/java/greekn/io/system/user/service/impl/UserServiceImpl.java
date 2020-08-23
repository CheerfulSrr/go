package greekn.io.system.user.service.impl;

import greekn.io.system.user.UserEntity;
import greekn.io.system.user.repository.UserRepository;
import greekn.io.system.user.service.UserService;
import greekn.io.system.user.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-21 16:32
 * @package: greekn.io.system.user.service.impl
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserEntity getUser(String username, String password) {
        UserEntity user = userRepository.findByName(username).orElseThrow(() -> new UsernameNotFoundException("未找到用户: " + username));
        if (password != null) {
            if (encoder.matches(password, user.getPassword())) {
                return user;
            } else {
                throw new BadCredentialsException("用户：" + username + " 密码错误");
            }
        }
        return user;
    }

    @Override
    public UserEntity getUser(String username) {
        return getUser(username, null);
    }

    @Override
    public UserEntity getUser(LoginRequest loginRequest) {
        return getUser(loginRequest.getName(), loginRequest.getPassword());
    }
}
