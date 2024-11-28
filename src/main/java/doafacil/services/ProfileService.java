package doafacil.services;

import java.util.Optional;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import doafacil.entities.Profile;
import doafacil.repositories.ProfileRepository;

@Service
public class ProfileService {

private final ProfileRepository profileRepository;
	
	public ProfileService(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	@EventListener(ContextRefreshedEvent.class)
	public Profile createAdmin() {
        Optional<Profile> existingProfile = profileRepository.findById(1L);
        if (existingProfile.isPresent()) {
            return existingProfile.get();
        }

        Profile profile = new Profile(1L, "admin");
        return profileRepository.save(profile);
    }
}
