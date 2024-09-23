package doafacil.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import doafacil.dtos.auth.AutenticacaoDTO;
import doafacil.dtos.auth.TokenDTO;
import doafacil.services.AutenticacaoService;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

	private final AutenticacaoService autenticacaoService;

	public AutenticacaoController(AutenticacaoService autenticacaoService) {
		this.autenticacaoService = autenticacaoService;
	}

	@PostMapping
	public ResponseEntity<TokenDTO> autenticar(@RequestBody AutenticacaoDTO authForm) {
		return ResponseEntity.ok(autenticacaoService.autenticar(authForm));
	}
}
