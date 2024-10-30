package doafacil.entities;

import jakarta.persistence.Entity;

@Entity
public class JuridicalPerson extends User {
	
	private static final long serialVersionUID = 1L;
	private String cnpj;

    public JuridicalPerson() {}

    public JuridicalPerson(String name, String email, String password, String phone, String cnpj, Profile profile) {
        super(name, email, password, profile, phone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
