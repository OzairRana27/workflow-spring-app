package com.learning.rule_engine.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // This is the line you need
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers(HttpMethod.DELETE, "/api/rules/**").permitAll()
                    .requestMatchers(HttpMethod.PUT, "/api/rules/**").permitAll()
                    .anyRequest().permitAll() // Allow all requests for now to test the DELETE
            );
        return http.build();
    }
}
