package doafacil.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import doafacil.entities.InterestedOnProduct;
import doafacil.entities.User;

@Repository
public interface InterestedOnProductRepository extends JpaRepository<InterestedOnProduct, Long> {

	@Query("SELECT pi.user FROM InterestedOnProduct pi WHERE pi.product.id = :productId")
    List<User> findInterestedUsersByProductId(@Param("productId") Long productId);
}
