package doafacil.dtos.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import doafacil.entities.JuridicalPerson;
import doafacil.entities.NaturalPerson;
import doafacil.entities.Profile;
import doafacil.entities.User;

public class UserMapper {

	public static User fromDTO(PostUserDTO dto) {
		Profile profile = new Profile();
		profile.setId(Long.parseLong("1"));	
		
		if(dto.getCpf() != null) {
			return new NaturalPerson(null, dto.getName(), dto.getEmail(), new BCryptPasswordEncoder().encode(dto.getPassword()), dto.getPhone(), dto.getCpf(), profile);
		} 
		
		return new JuridicalPerson(null, dto.getName(), dto.getEmail(), new BCryptPasswordEncoder().encode(dto.getPassword()), dto.getPhone(), dto.getCnpj(), profile);
	}
	
	public static User fromDTOPut(User user, PutUserDTO dto) {	
		user.setName(dto.getName() != "" ? dto.getName() : user.getName());
		user.setPhone(dto.getPhone() != "" ? dto.getPhone() : user.getPhone());
		 
		return user;
	}
	
	public static GetUserDTO fromEntity(User user) {
		if (user instanceof NaturalPerson) {
			NaturalPerson naturalPerson = (NaturalPerson) user;
			return new GetUserDTO(user.getId(), user.getName(), user.getEmail(), user.getPhone(), null, naturalPerson.getCpf());
		}
		
		JuridicalPerson juridicalPerson = (JuridicalPerson) user;
		return new GetUserDTO(user.getId(), user.getName(), user.getEmail(), user.getPhone(), juridicalPerson.getCnpj(), null);
	}
}
