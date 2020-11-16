package io.greekn.config;

import org.hibernate.dialect.MySQL57Dialect;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-09 21:01
 * @package: io.greekn.config
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class MySQLUTF8Dialect extends MySQL57Dialect {
    @Override
    public String getTableTypeString() {
        return "engine innodb charset utf8mb4 collate utf8mb4_general_ci";
    }
}
