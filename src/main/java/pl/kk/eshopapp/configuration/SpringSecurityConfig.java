package pl.kk.eshopapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password(passwordEncoder().encode("user1Pass")).roles("USER")
                .and()
                .withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("adminPass")).roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
                .antMatchers("/index").access("hasRole('USER') or hasRole('ADMIN')")
                .antMatchers("/login*").permitAll()
                .antMatchers("/header*").permitAll()
                .antMatchers("/regist*").permitAll()
                .antMatchers("/css/**", "/js/**", "/images/**").permitAll()
                .anyRequest().authenticated();

        http.formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/appLogin")
                .usernameParameter("username")
                .passwordParameter("pass")
                .defaultSuccessUrl("/", true);
        // .failureHandler(authenticationFailureHandler())
        http.csrf().disable();
        http.headers().frameOptions().disable();
        http.logout()
                .logoutSuccessUrl("/login")
                .logoutUrl("/logout")
        //  .logoutSuccessHandler(logoutSuccessHandler())
        ;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
