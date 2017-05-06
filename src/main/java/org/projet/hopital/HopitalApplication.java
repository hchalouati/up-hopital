package org.projet.hopital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EntityScan(basePackageClasses = {HopitalApplication.class})
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"org.projet.hopital"})
public class HopitalApplication  extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
