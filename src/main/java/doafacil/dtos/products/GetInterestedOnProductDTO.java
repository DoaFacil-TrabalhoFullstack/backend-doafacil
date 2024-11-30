package doafacil.dtos.products;

public class GetInterestedOnProductDTO {
	
    private GetProductDTO productDTO;

    public GetInterestedOnProductDTO() {}

	public GetInterestedOnProductDTO(GetProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	
	public GetProductDTO getProductId() {
		return productDTO;
	}
}
