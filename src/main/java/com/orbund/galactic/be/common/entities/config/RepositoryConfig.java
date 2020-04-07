package com.orbund.galactic.be.common.entities.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.orbund.galactic.be.common.entities.repository"})
@ComponentScan(basePackages = {"com.orbund.galactic.be.common.entities.entity"})
public class RepositoryConfig {

}
