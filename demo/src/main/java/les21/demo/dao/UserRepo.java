package les21.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import les21.demo.domain.User;



public interface UserRepo extends JpaRepository<User, Integer>{

	List<User> findByEmail(String email);

}
