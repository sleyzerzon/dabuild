package com.github.dabuild.config.server


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
class DabuildConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DabuildConfigServerApplication.class, args)
    }

}
