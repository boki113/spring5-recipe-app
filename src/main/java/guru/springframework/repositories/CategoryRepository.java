package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;
/**
 * 
 * @author perica
 *
 */
public interface CategoryRepository extends CrudRepository<Category,Long>{
	
}
