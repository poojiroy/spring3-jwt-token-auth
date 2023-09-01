package service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import entity.UserData;
import repository.UserRepository;

@Service
public class CustomeUserDetailService implements UserDetailsService{
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserData user= userRepository.findByEmail(username).orElseThrow(()-> new RuntimeException("user Not Found!"));
		
		return  (UserDetails) user;
	}

}
