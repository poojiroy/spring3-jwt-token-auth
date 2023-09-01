package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.UserData;

public interface UserRepository extends JpaRepository<UserData, String>{
	Optional<UserData> findByEmail(String email);

}
