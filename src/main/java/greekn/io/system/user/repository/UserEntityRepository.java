package greekn.io.system.user.repository;

import greekn.io.system.user.UserEntity;
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
 * @date 2020-08-15 12:28
 * @package: greekn.io.system.user.repository
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByName(String name);

}
