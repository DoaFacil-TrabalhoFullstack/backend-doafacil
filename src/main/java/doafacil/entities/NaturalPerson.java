package doafacil.entities;

import jakarta.persistence.Entity;

@Entity
public class NaturalPerson extends User {
	
	private static final long serialVersionUID = 1L;
	private String cpf;

    public NaturalPerson() {}

    public NaturalPerson(Long id, String name, String email, String password, String phone, String cpf, Profile profile) {
        super(id, name, email, password, profile, phone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
