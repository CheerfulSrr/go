package io.greekn.kind;

import io.greekn.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-08 15:33
 * @package io.greekn.kind
 * @modified Greekn
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "kind")
@Entity
public class KindEntity extends BaseEntity {
    /**
     * 类型名称
     * 前台根据类型名称决定访问的路径
     */
    private String kindName;
    /**
     * 别名
     */
    private String aliasName;
}
