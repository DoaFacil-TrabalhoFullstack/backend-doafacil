package doafacil.dtos.products;

public class PostProductDTO {
	
    private String name;
    private String description;
   	private Long owner;
   	
	public PostProductDTO(String name, String description, Long owner) {
		this.name = name;
		this.description = description;
		this.owner = owner;
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

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }
}
