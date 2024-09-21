package doafacil.services;

import org.springframework.stereotype.Service;

import doafacil.entities.Teste;
import doafacil.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	private Teste teste = new Teste();
	/*private final ProdutoRepository ProdutoRepository;
	
	ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}*/

	public Teste testandoService() {
		teste.setTeste01(ProdutoRepository.teste01);
		teste.setTeste02(ProdutoRepository.teste02);
		return teste;
	}
}
