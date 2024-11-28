package doafacil.dtos.user;

import doafacil.entities.Profile;

public class PostUserDTO {

	private String name;
    private String email;
    private String password;
    private String phone;
    private Profile profile;
    private String cpf;
    private String cnpj;

	public PostUserDTO(String name, String email, String password, String phone, Profile profile, String cpf, String cnpj) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.profile = profile;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
