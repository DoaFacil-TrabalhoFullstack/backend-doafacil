package doafacil.entities;

import jakarta.persistence.Entity;

@Entity
public class JuridicalPerson extends User {
    private String cnpj;

    public JuridicalPerson() {}

    public JuridicalPerson(String name, String email, String password, String phone, String cnpj) {
        super(name, email, password, phone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
