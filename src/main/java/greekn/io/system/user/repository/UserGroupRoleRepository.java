package greekn.io.system.user.repository;

import greekn.io.system.user.UserGroupRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-16 11:48
 * @package: greekn.io.system.user.repository
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Repository
public interface UserGroupRoleRepository extends JpaRepository<UserGroupRoleEntity, Integer> {

    Optional<UserGroupRoleEntity> findByUserId(Integer userId);

}
