package doafacil.dtos.user;

import doafacil.entities.JuridicalPerson;
import doafacil.entities.NaturalPerson;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import doafacil.entities.Profile;
import doafacil.entities.User;

public class UserMapper {

	public static User fromDTO(PostUserDTO dto) {
		Profile profile = new Profile();
		profile.setId(Long.parseLong("1"));

		return new User(null, dto.getName(), dto.getEmail(), new BCryptPasswordEncoder().encode(dto.getPassword()), profile, dto.getPhone());
	}

	public static NaturalPerson fromDTOCPF(PostUserDTO dto) {
		Profile profile = new Profile();
		profile.setId(1L);

		return new NaturalPerson(
				dto.getName(),
				dto.getEmail(),
				new BCryptPasswordEncoder().encode(dto.getPassword()),
				dto.getPhone(),
				dto.getCpf(),
				profile
		);
	}

	public static JuridicalPerson fromDTOCNPJ(PostUserDTO dto) {
		Profile profile = new Profile();
		profile.setId(1L);

		return new JuridicalPerson(
				dto.getName(),
				dto.getEmail(),
				new BCryptPasswordEncoder().encode(dto.getPassword()),
				dto.getPhone(),
				dto.getCnpj(),
				profile
		);
	}
	
	public static GetUserDTO fromEntity(User user) {
		return new GetUserDTO(user.getName(), user.getEmail(), user.getPhone(), user.getProfile().getName());
	}
}
