package com.tr.frame.auth;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Configuration
@ComponentScan({"com.tr.frame.auth"})
@EnableJpaRepositories
@EntityScan
public class AuthAutoConfiguration {
}
