package islam.sharia.dao;

import islam.sharia.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
