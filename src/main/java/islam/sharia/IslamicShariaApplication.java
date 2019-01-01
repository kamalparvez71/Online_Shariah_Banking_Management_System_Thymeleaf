package islam.sharia;

import islam.sharia.domain.User;
import islam.sharia.domain.security.Role;
import islam.sharia.domain.security.UserRole;
import islam.sharia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class IslamicShariaApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(IslamicShariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Admin");
		user1.setLastName("Admin");
		user1.setPhone("+8801703777773");
		user1.setUsername("Admin");
		user1.setPassword("password");
		user1.setEmail("Admin@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));
		userService.createUser(user1, userRoles);

		userRoles.clear();
		User user2 = new User();
		user2.setFirstName("Kamal");
		user2.setLastName("Parvez");
		user2.setPhone("+8801911933313");
		user2.setUsername("kamalparvez711");
		user2.setPassword("password");
		user2.setEmail("kamalparvez71@yahoo.com");
		Role role2 = new Role();
		role2.setRoleId(1);
		role2.setName("ROLE_USER");
		userRoles.add(new UserRole(user2, role2));
		userService.createUser(user2, userRoles);

	}
}
