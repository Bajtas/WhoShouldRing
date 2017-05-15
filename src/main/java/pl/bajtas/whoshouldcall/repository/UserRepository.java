package pl.bajtas.whoshouldcall.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bajtas.whoshouldcall.model.User;

/**
 * Created by Bajtas on 13.05.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("select u from User u join fetch u.queueUsers qu where u.login = ?1")
    User findByLogin(String login);
}
