package doafacil.dtos.products;

public class PostInterestedOnProductDTO {
	
    private Long productId;

    public PostInterestedOnProductDTO() {}

	public PostInterestedOnProductDTO(Long userId, Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
