package doafacil.dtos.products;

import doafacil.dtos.user.GetUserDTO;
import doafacil.entities.InterestedOnProduct;
import doafacil.entities.Product;
import doafacil.entities.User;

public class InterestedOnProductMapper {
	public static InterestedOnProduct fromDTO(User user, Product product) {
		return new InterestedOnProduct(product, user);
	}
	
	public static GetInterestedOnProductDTO fromEntity(InterestedOnProduct interestedOnProduct) {
		GetUserDTO getUserDTO = new GetUserDTO(interestedOnProduct.getUser().getId(), interestedOnProduct.getUser().getName(), interestedOnProduct.getUser().getEmail(), interestedOnProduct.getUser().getPhone());
		GetProductDTO getProductDTO = new GetProductDTO(interestedOnProduct.getProduct().getId(), interestedOnProduct.getProduct().getName(), interestedOnProduct.getProduct().getDescription(), getUserDTO);
		
		return new GetInterestedOnProductDTO(getProductDTO);
	}
}
