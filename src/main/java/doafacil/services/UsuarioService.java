package doafacil.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import doafacil.entities.Perfil;
import doafacil.entities.Usuario;

@Service
public class UsuarioService implements UserDetailsService {

	Perfil perfil = new Perfil(Long.parseLong("1"), "Admin");
	Usuario usuarioTeste = new Usuario(Long.parseLong("1"), "Teste", "teste@teste.com", new BCryptPasswordEncoder().encode("123"), perfil);
	
	public Usuario buscarUsuarioPorId(Long idUsuario) {
		return usuarioTeste;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails userDetails = null;
		
		if(username.equals(this.usuarioTeste.getEmail())) 
			userDetails = this.usuarioTeste;
		
		return userDetails;
	}
}
