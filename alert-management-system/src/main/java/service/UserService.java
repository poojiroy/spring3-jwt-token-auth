package service;

//import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import entity.UserData;
import repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	

		public List<UserData> getUsers(){
		return userRepository.findAll();
		
	}
		public  UserData createUser(UserData user) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setUserId(UUID.randomUUID().toString());
			return userRepository.save(user);
		}
		

}
