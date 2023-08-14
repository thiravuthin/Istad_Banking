//package com.istad.mbanking.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.web.SecurityFilterChain;
//
//
///* TODO : @EnableWebSecurity
//          In the configuration class, we need to use the @EnableWebSecurity annotation
//          to disable the default security configuration.*/
//@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
//
//    /* TODO : SecurityFilterChain
//              The SecurityFilterChain contains the list of all the filters
//              involved in Spring Security. */
//    /* TODO : HttpSecurity
//              HttpSecurity It allows configuring web based security for specific http requests.
//              By default it will be applied to all requests, but can be restricted using
//              requestMatcher (RequestMatcher) or other similar methods. */
//    /* TODO : UserDetailsService
//              The UserDetailsService interface is used to retrieve user-related data. */
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.build();
//    }
//
//
//
//}
//
