package les21.demo;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import les21.demo.domain.UserRole;


@Repository
public interface UserRolesRepo extends CrudRepository<UserRole, Integer> {

	@Query("select a.role from UserRole a, User b where b.userName=? and a.userId = b.userId")
	public List<String> findRolesByUserName(String username);
}
