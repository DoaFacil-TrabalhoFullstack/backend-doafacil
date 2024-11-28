package doafacil.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import doafacil.entities.Product;
import doafacil.entities.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	@Query("SELECT p FROM Product p WHERE p.owner = :owner")
	Optional<List<Product>> findByOwnerId(User owner);
	
	Optional<Product> findById(Long productId);
	List<Product> findAll();
}
