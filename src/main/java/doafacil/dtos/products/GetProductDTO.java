package doafacil.dtos.products;

import doafacil.dtos.user.GetUserDTO;

public class GetProductDTO {

	private Long id;
    private String name;
    private String description;
   	private GetUserDTO owner;

	public GetProductDTO(Long id, String name, String description, GetUserDTO owner) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.owner = owner;
	}

	public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public GetUserDTO getOwner() {
        return owner;
    }
}
