package by.minsk.ussr.baby.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
    @Bean
    public PrincipalExtractor customPrincipalExtractor() {
        return new UserPrincipalExtractor();
    }
}