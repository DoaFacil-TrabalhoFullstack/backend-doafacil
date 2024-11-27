package doafacil.dtos.products;

import doafacil.dtos.user.GetUserDTO;
import doafacil.entities.Product;
import doafacil.entities.User;

public class ProductMapper {
	
	public static Product fromDTO(PostProductDTO dto, User userOwner) {
		return new Product(null, dto.getName(), dto.getDescription(), userOwner);
	}
	
	public static GetProductDTO fromEntity(Product product) {
		GetUserDTO dto = new GetUserDTO(product.getOwner().getName(), product.getOwner().getEmail(), product.getOwner().getPhone());
		return new GetProductDTO(product.getId(), product.getName(), product.getDescription(), dto);
	}
}
