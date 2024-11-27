package doafacil.dtos.products;

import doafacil.entities.Product;
import doafacil.entities.User;

public class ProductMapper {
	
	public static Product fromDTO(PostProductDTO dto, User userOwner) {
		return new Product(null, dto.getName(), dto.getDescription(), userOwner);
	}
	
	public static GetProductDTO fromEntity(Product product) {
		return new GetProductDTO(product.getId(), product.getName(), product.getDescription(), product.getOwner());
	}
}
