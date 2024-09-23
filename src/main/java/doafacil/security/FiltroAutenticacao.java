package doafacil.security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import doafacil.entities.Usuario;
import doafacil.services.AutenticacaoService;
import doafacil.services.UsuarioService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FiltroAutenticacao extends OncePerRequestFilter {
	private final AutenticacaoService autenticacaoService;
	private final UsuarioService usuarioService;
	
	public FiltroAutenticacao(AutenticacaoService autenticacaoService, UsuarioService usuarioService) {
		this.autenticacaoService = autenticacaoService;
		this.usuarioService = usuarioService; 
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		String header = request.getHeader("Authorization");
		String token = null;
		if(header != null && header.startsWith("Bearer")) {
			token = header.substring(7, header.length());
		}
		
		if(autenticacaoService.verificarToken(token)) {
			Long idUsuario = autenticacaoService.retornarIdUsuario(token);
			Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);											
			SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities()));
		}
		
		filterChain.doFilter(request, response);
	}
}
