package greekn.io.web.repository;

import greekn.io.web.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-10 17:04
 * @package: greekn.io.web.repository
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {

}
