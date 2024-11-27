package doafacil.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import doafacil.entities.Product;
import doafacil.entities.User;
import doafacil.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
		
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProductById(Long productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product.orElseThrow(() -> new EntityNotFoundException("Produto não encontrado!"));
	}
	
	public List<Product> getProductByOwner(User ownerUser) {
		Optional<List<Product>> productsByowner = productRepository.findByOwnerId(ownerUser);
	    return productsByowner.orElseThrow(() -> new EntityNotFoundException("Nenhum produto encontrado para o proprietário especificado!"));
	}
	
	public List<Product> getAllProducts() {
		System.out.println(productRepository.findAll());
		Optional<List<Product>> allProducts = Optional.of(productRepository.findAll());
		System.out.println(allProducts);
	    return allProducts.orElseThrow(() -> new EntityNotFoundException("Nenhum produto cadastrado!"));
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
}
