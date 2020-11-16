package io.greekn.schedule;

import io.greekn.schedule.dto.ScheduleDto;
import io.greekn.schedule.repository.ScheduleRepository;
import io.greekn.schedule.service.ScheduleService;
import io.greekn.schedule.vo.ScheduleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static io.greekn.base.ResponseFactory.*;
import static io.greekn.util.ConvertUtils.*;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-14 19:34
 * @package io.greekn.schedule
 * @modified Greekn
 * @description
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/save")
    public ResponseEntity save(ScheduleDto dto) {
        scheduleService.save(dto);
        return ok();
    }

    @GetMapping("/list")
    public ResponseEntity<List<ScheduleVo>> list(){
        return ok(sourceToTarget(scheduleRepository.findAll(), ScheduleVo.class));
    }

}
