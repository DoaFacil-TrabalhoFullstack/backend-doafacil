package doafacil.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import doafacil.entities.InterestedOnProduct;
import doafacil.entities.Product;
import doafacil.entities.User;
import doafacil.repositories.InterestedOnProductRepository;
import doafacil.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
		
	private final ProductRepository productRepository;
	private final InterestedOnProductRepository interestedOnProductRepository;
	
	public ProductService(ProductRepository productRepository, InterestedOnProductRepository productInterestedRepository) {
		this.productRepository = productRepository;
		this.interestedOnProductRepository = productInterestedRepository;
	}

	public Product getProductById(Long productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product.orElseThrow(() -> new EntityNotFoundException("Produto não encontrado!"));
	}
	
	public List<Product> getProductByOwner(User ownerUser) {
		Optional<List<Product>> productsByOwner = productRepository.findByOwnerId(ownerUser);
	    return productsByOwner.orElseThrow(() -> new EntityNotFoundException("Nenhum produto encontrado para o proprietário especificado!"));
	}
	
	public List<Product> getAllProducts() {
		Optional<List<Product>> allProducts = Optional.of(productRepository.findAll());
	    return allProducts.orElseThrow(() -> new EntityNotFoundException("Nenhum produto cadastrado!"));
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}  

	public List<User> getAllInterestedOnProduct(Long productId) {
        List<User> interestedUsers = interestedOnProductRepository.findInterestedUsersByProductId(productId);
        if (interestedUsers.isEmpty()) {
            System.out.println("Nenhum usuário interessado no produto com ID: " + productId);
        }
        return interestedUsers;
    }
	
	public InterestedOnProduct createInterestedOnProduct(InterestedOnProduct interestedOnProduct) {
		return interestedOnProductRepository.save(interestedOnProduct);
	}
}
