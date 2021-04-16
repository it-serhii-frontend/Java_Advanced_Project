package les21.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import les21.demo.dao.UserRepo;
import les21.demo.domain.User;
import les21.demo.domain.UserRole;


@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setPassword(bCryptPasswordEncoder.encode(user.getPasswordConfirm()));
		user.setRole(UserRole.ROLE_USER);
		userRepo.save(user);
	}
}
