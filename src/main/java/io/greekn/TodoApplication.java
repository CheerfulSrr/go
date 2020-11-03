package io.greekn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-03 23:09
 * @package: io.greekn
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TodoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class);
    }
}
