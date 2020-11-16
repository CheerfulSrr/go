package io.greekn.schedule.dto;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 14:40
 * @package io.greekn.schedule.dto
 * @modified Greekn
 * @description
 */
@Data
public class ScheduleDetailDto {
    private Integer scheduleId;
    private Integer status;
    private String currentChapter;
    private Date currentChapterStartDate;
}
