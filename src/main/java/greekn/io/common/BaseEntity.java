package greekn.io.common;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * entity基类
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-11 14:47
 * @package: greekn.io.common
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Data
@DynamicInsert
@DynamicUpdate
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updateTime;

}
