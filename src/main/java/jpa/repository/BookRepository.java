package jpa.repository;

import jpa.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by DELL on 06/06/17.
 */
@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer>{

}
