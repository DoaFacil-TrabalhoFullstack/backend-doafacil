package doafacil.controllers;

import doafacil.dtos.auth.AuthDTO;
import doafacil.dtos.auth.TokenDTO;
import doafacil.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import doafacil.dtos.user.GetUserDTO;
import doafacil.dtos.user.PostUserDTO;
import doafacil.dtos.user.UserMapper;
import doafacil.entities.User;
import doafacil.services.UserService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("v1/users")
@CrossOrigin
public class UserController {

	private final UserService userService;
	private final AuthService authService;

	public UserController(UserService userService, AuthService authService) {
		this.userService = userService;
		this.authService = authService;
	}

	@PostMapping("/register")
	public ResponseEntity<TokenDTO> createUser(@RequestBody PostUserDTO postUserDTO) {
		User user;

		if (postUserDTO.getCpf() != null) {
			user = userService.createUser(UserMapper.fromDTOCPF(postUserDTO));
		} else {
			user = userService.createUser(UserMapper.fromDTOCNPJ(postUserDTO));
		}

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user.getId())
				.toUri();

		AuthDTO auth = new AuthDTO(postUserDTO.getEmail(), postUserDTO.getPassword());

		TokenDTO token = authService.authenticate(auth);
 
		return ResponseEntity.created(location).body(token);
	}

	@PostMapping("login")

	
	@GetMapping("/list")
	public ResponseEntity<GetUserDTO> getUser(@RequestParam String emailUser) {
		User user = userService.getUserByEmail(emailUser);
		return ResponseEntity.ok(UserMapper.fromEntity(user));
	}
}
