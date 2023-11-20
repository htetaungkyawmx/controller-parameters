package com.example.controllerparameters.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication()
                .withUser("john")
                .password(passwordEncoder().encode("john"))
                .roles("USER")
                .and()
                .withUser("mary")
                .password(passwordEncoder().encode("mary"))
                .roles("USER");
    }

   // @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/actionF").authenticated()
                .antMatchers("/*").permitAll()
                .and()
                .csrf().disable()
                .httpBasic()
                .realmName("Spring Tutorial");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
