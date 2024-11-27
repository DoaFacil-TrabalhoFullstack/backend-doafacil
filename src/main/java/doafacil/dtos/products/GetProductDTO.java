package doafacil.dtos.products;

import doafacil.entities.User;

public class GetProductDTO {

	private Long id;
    private String name;
    private String description;
   	private User owner;

	public GetProductDTO(Long id, String name, String description, User owner) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.owner = owner;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
