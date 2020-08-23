package greekn.io.config.naming;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

import java.util.Locale;

/**
 * <p>
 * hibernate驼峰命名策略
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-16 16:49
 * @package: greekn.io.config
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class SpringPhysicalNamingStrategy implements PhysicalNamingStrategy {
    public SpringPhysicalNamingStrategy() {
    }

    @Override
    public Identifier toPhysicalCatalogName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return this.apply(name, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalSchemaName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return this.apply(name, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return this.apply(name, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return this.apply(name, jdbcEnvironment);
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return this.apply(name, jdbcEnvironment);
    }

    private Identifier apply(Identifier name, JdbcEnvironment jdbcEnvironment) {
        if (name == null) {
            return null;
        } else {
            StringBuilder builder = new StringBuilder(name.getText().replace('.', '_'));

            for(int i = 1; i < builder.length() - 1; ++i) {
                if (this.isUnderscoreRequired(builder.charAt(i - 1), builder.charAt(i), builder.charAt(i + 1))) {
                    builder.insert(i++, '_');
                }
            }

            return this.getIdentifier(builder.toString(), name.isQuoted(), jdbcEnvironment);
        }
    }

    protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
        if (this.isCaseInsensitive(jdbcEnvironment)) {
            name = name.toLowerCase(Locale.ROOT);
        }

        return new Identifier(name, quoted);
    }

    protected boolean isCaseInsensitive(JdbcEnvironment jdbcEnvironment) {
        return true;
    }

    private boolean isUnderscoreRequired(char before, char current, char after) {
        return Character.isLowerCase(before) && Character.isUpperCase(current) && Character.isLowerCase(after);
    }
}
