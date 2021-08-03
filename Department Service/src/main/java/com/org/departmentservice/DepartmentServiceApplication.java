package com.org.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.org.departmentservice.*", "com.org.departmentservice.configuration"})
@EntityScan()
@EnableJpaRepositories(basePackages = "com.org.departmentservice.repository", entityManagerFactoryRef = "entityManagerFactory")
@EnableEurekaClient
public class DepartmentServiceApplication {
    //https://www.youtube.com/watch?v=BnknNTN8icw
    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

}
