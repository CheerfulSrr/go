package greekn.io.system.user.service;

import greekn.io.system.user.UserEntity;
import greekn.io.system.user.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-15 12:28
 * @package: greekn.io.system.user.service
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userEntityRepository.findByName(username).orElseThrow(() -> new UsernameNotFoundException("未找到用户: " + username));

        return null;
    }
}
