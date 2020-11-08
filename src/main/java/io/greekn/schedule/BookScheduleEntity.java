package io.greekn.schedule;

import io.greekn.base.BaseEntity;
import io.greekn.book.BookInfoEntity;
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
 * @date 2020-11-08 0:28
 * @package io.greekn.kind
 * @modified Greekn
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "book_schedule")
@Entity
public class BookScheduleEntity extends BaseEntity {
    /**
     * 关联的书籍
     */
    @ManyToOne
    @JoinColumn(name = "book_info_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private BookInfoEntity bookInfo;

    /**
     * 开始日期
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startDate;
    /**
     * 结束日期
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endDate;
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
    private Integer currentChapter;
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
