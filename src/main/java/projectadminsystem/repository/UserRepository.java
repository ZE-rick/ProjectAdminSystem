package projectadminsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectadminsystem.model.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
