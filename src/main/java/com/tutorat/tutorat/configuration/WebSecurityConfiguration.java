package com.tutorat.tutorat.configuration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfiguration {
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/signup").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin().permitAll() // Pour permettre l'accès au formulaire de connexion
                .and()
            .logout().permitAll(); // Pour permettre la déconnexion

        return http.build();
    }
@Bean
public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
}
}

