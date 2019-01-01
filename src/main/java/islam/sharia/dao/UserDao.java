package islam.sharia.dao;

import islam.sharia.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface UserDao extends CrudRepository<User, Long>{

    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
