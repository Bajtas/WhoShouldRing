package pl.bajtas.whoshouldcall.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bajtas.whoshouldcall.model.Queue;

/**
 * Created by Bajtas on 13.05.2017.
 */
@Repository
public interface QueueRepository extends CrudRepository<Queue, Integer> {
}