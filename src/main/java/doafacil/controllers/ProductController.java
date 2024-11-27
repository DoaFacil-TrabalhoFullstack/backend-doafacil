package doafacil.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import doafacil.dtos.products.GetProductDTO;
import doafacil.dtos.products.PostProductDTO;
import doafacil.dtos.products.ProductMapper;
import doafacil.entities.Product;
import doafacil.entities.User;
import doafacil.services.ProductService;
import doafacil.services.UserService;

@RestController
@RequestMapping("v1/products")
public class ProductController {
	
	private final ProductService productService;
	private final UserService userService;
	
	public ProductController(ProductService productService, UserService userService) {
		this.productService = productService;
		this.userService = userService;
	}

	@PostMapping("/create")
	public ResponseEntity<GetProductDTO> createProduct(@RequestBody PostProductDTO postProductDTO) {
		User userOwner = userService.getUserById(postProductDTO.getOwner());
		
		Product product = productService.createProduct(ProductMapper.fromDTO(postProductDTO, userOwner));
		
		return ResponseEntity.ok(ProductMapper.fromEntity(product));
	}
	
	@GetMapping("/list/ownerId")
	public ResponseEntity<List<GetProductDTO>> getProductByOwner(@RequestParam Long ownerId) {
		User userOwner = userService.getUserById(ownerId);
		
		List<Product> products = productService.getProductByOwner(userOwner);
		List<GetProductDTO> productDTOs = products.stream()
				  								  .map(ProductMapper::fromEntity)
				  								  .toList();
		return ResponseEntity.ok(productDTOs);
	}
	
	@GetMapping("/list/productId")
	public ResponseEntity<GetProductDTO> getUser(@RequestParam Long productId) {
		Product product = productService.getProductById(productId);
		return ResponseEntity.ok(ProductMapper.fromEntity(product));
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<GetProductDTO>> getProduct() {
		List<Product> products = productService.getAllProducts();
		List<GetProductDTO> productDTOs = products.stream()
	            								  .map(ProductMapper::fromEntity)
	            								  .toList();
		return ResponseEntity.ok(productDTOs);
	}
}
