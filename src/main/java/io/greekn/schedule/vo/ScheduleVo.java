package io.greekn.schedule.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 14:48
 * @package io.greekn.schedule.vo
 * @modified Greekn
 * @description
 */
@Data
public class ScheduleVo implements Serializable {
    private Integer id;
    private String scheduleName;
    private Date startDate;
    private Date endDate;
}
