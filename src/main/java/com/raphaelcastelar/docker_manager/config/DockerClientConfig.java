package com.raphaelcastelar.docker_manager.config;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DockerClientConfig {

    @Value("${docker.socket.path:/var/run/docker.sock}")
    private String dockerSocketPath;


    @Bean
    public DockerClient buildDockerClient() {
        return DockerClientBuilder.getInstance().build();


    }
}
