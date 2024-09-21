package doafacil.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import doafacil.entities.Teste;
import doafacil.services.ProdutoService;

@RestController
@RequestMapping("v1/produto")
public class ProdutoController {

	private final ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@GetMapping("teste")
	public ResponseEntity<Teste> testandoClasses() {
		Teste valorDoTeste = produtoService.testandoService();
		return  ResponseEntity.ok(valorDoTeste);
	}
}
