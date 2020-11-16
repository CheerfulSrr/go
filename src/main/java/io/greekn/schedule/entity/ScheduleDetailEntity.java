package io.greekn.schedule.entity;

import io.greekn.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-14 19:28
 * @package io.greekn.schedule
 * @modified Greekn
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "schedule_detail")
@Entity
public class ScheduleDetailEntity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private ScheduleEntity schedule;
    /**
     * 计划状态
     * 0: 未开始
     * 1: 开始
     * 2: 暂停
     * 3: 停止
     * 4: 结束
     */
    private Integer status;
    /**
     * 当前章节
     */
    private String currentChapter;
    /**
     * 结束章节
     */
    private String endChapter;

    /**
     * 当前章节开始日期
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentChapterStartDate;
    /**
     * 当前章节所用天数
     * 包括添加计划的那天
     */
    private Integer currentChapterDay;
    /**
     * 当前章节所用小时
     * 默认截止至上一天24点
     */
    private Integer currentChapterHour;
}
