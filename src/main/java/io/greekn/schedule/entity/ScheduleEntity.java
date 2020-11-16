package io.greekn.schedule.entity;

import io.greekn.base.BaseEntity;
import io.greekn.kind.KindInfoEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "schedule")
@Entity
public class ScheduleEntity extends BaseEntity {
    /**
     * 关联的书籍
     */
    @ManyToOne
    @JoinColumn(name = "kind_info_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private KindInfoEntity kindInfo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schedule")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private Set<ScheduleDetailEntity> scheduleDetailEntities = new HashSet<>();
    /**
     * 计划名称
     */
    private String scheduleName;
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

}
