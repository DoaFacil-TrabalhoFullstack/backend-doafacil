package doafacil.entities;

import doafacil.interfaces.Donor;
import jakarta.persistence.Entity;

@Entity
public class JuridicalPerson extends User implements Donor {
    private String cnpj;

    public JuridicalPerson() {}

    public JuridicalPerson(String name, String email, String password, String phone, String cnpj) {
        super(name, email, password, phone);
        this.cnpj = cnpj;
    }

    @Override
    public void donate() {
        System.out.println(this.cnpj + "Is Donating!");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
