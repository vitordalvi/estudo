package com.vitordalvi.estudo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean (name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }

    @Bean(name = "otherConfiguration")
    public String otherConfiguration() {
        return "Sistema de Vendas";
    }
}
