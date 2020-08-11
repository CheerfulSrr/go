package greekn.io.web.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-10 17:03
 * @package: greekn.io.web.entity
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
@Entity
@Table
@Data
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public Integer sex;

}
