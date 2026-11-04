package so.fine.codingchallenge.db.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import so.fine.codingchallenge.db.entity.user.User;

//Spring Data JPA repository providing operations for User entities
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
