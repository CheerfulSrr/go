package io.greekn.schedule.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-14 19:38
 * @package io.greekn.schedule.dto
 * @modified Greekn
 * @description
 */
@Data
public class ScheduleDto {
    private Integer kindInfoId;
    private String scheduleName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date startDate;
    private Date endDate;
}
