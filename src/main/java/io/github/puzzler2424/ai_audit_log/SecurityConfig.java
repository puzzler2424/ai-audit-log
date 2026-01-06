package io.github.puzzler2424.ai_audit_log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // 보안을 잠시 해제
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // 모든 접속 허용
        return http.build();
    }
}