package doafacil.services;

import org.springframework.stereotype.Service;

import doafacil.entities.Teste;
import doafacil.repositories.ProductRepository;

@Service
public class ProductService {
	private Teste teste = new Teste();

	public Teste testandoService() {
		teste.setTeste01(ProductRepository.teste01);
		teste.setTeste02(ProductRepository.teste02);
		return teste;
	}
}
