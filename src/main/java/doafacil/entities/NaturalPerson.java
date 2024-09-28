package doafacil.entities;

import jakarta.persistence.Entity;

@Entity
public class NaturalPerson extends User {

    private String cpf;

    public NaturalPerson() {}

    public NaturalPerson(String name, String email, String password, String phone, String cpf) {
        super(name, email, password, phone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
