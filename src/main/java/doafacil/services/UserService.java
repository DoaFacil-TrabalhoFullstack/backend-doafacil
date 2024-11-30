package doafacil.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import doafacil.entities.User;
import doafacil.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User getUserByEmail(String userEmail) {
		Optional<User> user = userRepository.findByEmail(userEmail);
		return user.orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado!"));
	}

	public User getUserById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		return user.orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado!"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return getUserByEmail(username);
	}

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User changeUser(User user) {
		return userRepository.save(user);
	}
}
