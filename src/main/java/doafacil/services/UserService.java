package doafacil.services;

import java.util.Optional;

import doafacil.exceptions.UserAlreadyExistsException;
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
		return user.orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado!"));
	}

	public User getUserById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		return user.orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado!"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return getUserByEmail(username);
	}

	public User createUser(User user) {
		Optional<User> createdUser = userRepository.findByEmail(user.getEmail());

		if (createdUser.isPresent()) {
			throw new UserAlreadyExistsException("Usuário com email " + user.getEmail() + " já existe.");
		}

		return userRepository.save(user);
	}
}
