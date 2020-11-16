package io.greekn.schedule.repository;

import io.greekn.schedule.entity.ScheduleDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 15:20
 * @package io.greekn.schedule.repository
 * @modified Greekn
 * @description
 */
@Repository
public interface ScheduleDetailRepository extends JpaRepository<ScheduleDetailEntity, Integer> {
}
