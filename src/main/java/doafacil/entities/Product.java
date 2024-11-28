package doafacil.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_products")
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
   	private User owner;

    public Product() {}
    
    public Product(Long id, String name, String description, User owner) {
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