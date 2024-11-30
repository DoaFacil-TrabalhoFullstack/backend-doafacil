package doafacil.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_products")
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InterestedOnProduct> productInterested;

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

	public List<InterestedOnProduct> getProductInterested() {
		return productInterested;
	}

	public void setProductInterested(List<InterestedOnProduct> productInterested) {
		this.productInterested = productInterested;
	}
}
