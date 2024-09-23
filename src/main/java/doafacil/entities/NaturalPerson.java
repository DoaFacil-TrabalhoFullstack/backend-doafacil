package doafacil.entities;

import doafacil.interfaces.Donee;
import doafacil.interfaces.Donor;
import jakarta.persistence.Entity;

@Entity
public class NaturalPerson extends User implements Donee, Donor {

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

    @Override
    public void receive() {
        System.out.println(this.getName() + "Has received!");
    }

    @Override
    public void donate() {
        System.out.println(this.getName() + "Has donated!");
    }
}
