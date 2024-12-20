package doafacil.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import doafacil.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{
	Optional<Profile> findById(Long profileId);
}
