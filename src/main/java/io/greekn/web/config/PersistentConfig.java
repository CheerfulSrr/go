package io.greekn.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-07 23:22
 * @package io.greekn.web.config
 * @modified Greekn
 * @description
 */
@Configuration
@EnableJpaAuditing
@EnableTransactionManagement
public class PersistentConfig {
}
