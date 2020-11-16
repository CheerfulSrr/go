package io.greekn.schedule.service;

import io.greekn.kind.KindInfoEntity;
import io.greekn.kind.KindInfoRepository;
import io.greekn.schedule.dto.ScheduleDto;
import io.greekn.schedule.entity.ScheduleEntity;
import io.greekn.schedule.repository.ScheduleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-14 22:59
 * @package io.greekn.schedule.service
 * @modified Greekn
 * @description
 */
@Service
public class ScheduleService {
    @Autowired
    private KindInfoRepository kindInfoRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;

    public void save(ScheduleDto dto) {
        KindInfoEntity kindInfoEntity = kindInfoRepository.findById(dto.getKindInfoId()).get();
        ScheduleEntity scheduleEntity = new ScheduleEntity();
        BeanUtils.copyProperties(dto, scheduleEntity);
        scheduleEntity.setKindInfo(kindInfoEntity);
        scheduleRepository.save(scheduleEntity);
    }
}
