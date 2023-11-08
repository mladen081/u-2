package u.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import u.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
