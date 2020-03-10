package org.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 * @author cdn
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ConsumerOrderRibbonApp {
    @Bean
    @LoadBalanced     //ribbon 负载均衡
    public RestTemplate getTem() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderRibbonApp.class,args);
        System.out.println("Hello Ribbon!");
    }

}
