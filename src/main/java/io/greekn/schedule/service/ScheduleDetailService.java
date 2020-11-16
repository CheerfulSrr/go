package io.greekn.schedule.service;

import io.greekn.schedule.dto.ScheduleDetailDto;
import io.greekn.schedule.entity.ScheduleDetailEntity;
import io.greekn.schedule.entity.ScheduleEntity;
import io.greekn.schedule.repository.ScheduleDetailRepository;
import io.greekn.schedule.repository.ScheduleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 15:17
 * @package io.greekn.schedule.service
 * @modified Greekn
 * @description
 */
@Service
public class ScheduleDetailService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private ScheduleDetailRepository scheduleDetailRepository;

    public void save(ScheduleDetailDto dto) {
        ScheduleEntity scheduleEntity = scheduleRepository.findById(dto.getScheduleId()).get();
        ScheduleDetailEntity scheduleDetailEntity = new ScheduleDetailEntity();
        scheduleDetailEntity.setSchedule(scheduleEntity);
        BeanUtils.copyProperties(dto, scheduleDetailEntity);
        scheduleDetailRepository.save(scheduleDetailEntity);
    }

    public List list() {
        List<ScheduleDetailEntity> all = scheduleDetailRepository.findAll();
        return null;
    }
}
