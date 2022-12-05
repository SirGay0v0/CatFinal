package repository;

import dto.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRep extends CrudRepository<Cat, Long> {}