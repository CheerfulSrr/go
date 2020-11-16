package io.greekn.schedule.repository;

import io.greekn.schedule.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-14 22:58
 * @package io.greekn.schedule.repository
 * @modified Greekn
 * @description
 */
@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Integer> {
}
