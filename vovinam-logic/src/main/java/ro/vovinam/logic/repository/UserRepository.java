package ro.vovinam.logic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.vovinam.logic.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
