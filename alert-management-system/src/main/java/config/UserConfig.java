package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class UserConfig {
	
	/*
	 * @Bean public UserDetailsService userDetailsService() { UserDetails
	 * poojitha=User.builder().username("poojitha").password(passwordEncoder().
	 * encode("poojitha")).roles("ADMIN").build(); UserDetails
	 * prasanth=User.builder().username("prasanth").password(passwordEncoder().
	 * encode("prasanth")).roles("MANAGER","ADMIN").build(); UserDetails
	 * sridher=User.builder().username("sridher").password(passwordEncoder().encode(
	 * "sridher")).roles("EMPLOYEE").build(); return new
	 * InMemoryUserDetailsManager(poojitha, prasanth, sridher); }
	 */
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }


}
