package io.greekn.schedule;

import io.greekn.schedule.dto.ScheduleDetailDto;
import io.greekn.schedule.service.ScheduleDetailService;
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

import static io.greekn.base.ResponseFactory.*;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 14:39
 * @package io.greekn.schedule
 * @modified Greekn
 * @description
 */
@RestController
@RequestMapping("/schedule/detail")
public class ScheduleDetailController {
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @Autowired
    private ScheduleDetailService scheduleDetailService;

    @GetMapping("/save")
    public ResponseEntity save(ScheduleDetailDto dto) {
        scheduleDetailService.save(dto);
        return ok();
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        return ok();
    }
}
