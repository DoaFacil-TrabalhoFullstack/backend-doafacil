package doafacil.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import doafacil.dtos.user.GetUserDTO;
import doafacil.dtos.user.PostUserDTO;
import doafacil.dtos.user.PutUserDTO;
import doafacil.dtos.user.UserMapper;
import doafacil.entities.User;
import doafacil.services.UserService;

@RestController
@RequestMapping("v1/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/create")
	public ResponseEntity<GetUserDTO> createUser(@RequestBody PostUserDTO postUserDTO) {
		User user = userService.createUser(UserMapper.fromDTO(postUserDTO));
		return ResponseEntity.ok(UserMapper.fromEntity(user));
	}
	
	@PutMapping("/update")
	public ResponseEntity<GetUserDTO> changeUser(@RequestBody PutUserDTO putUserDTO) {
		User user = userService.getUserByEmail(putUserDTO.getEmail());
		User userChanged = userService.changeUser(UserMapper.fromDTOPut(user, putUserDTO));
		return ResponseEntity.ok(UserMapper.fromEntity(userChanged));
	}
	
	@GetMapping("/list")
	public ResponseEntity<GetUserDTO> getUser(@RequestParam String emailUser) {
		User user = userService.getUserByEmail(emailUser);
		return ResponseEntity.ok(UserMapper.fromEntity(user));
	}
}
