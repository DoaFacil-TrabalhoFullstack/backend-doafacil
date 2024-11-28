package doafacil.dtos.user;

public class GetUserDTO {
	
	private String name;
    private String email;
    private String phone;
    private String cpf;
    private String cnpj;

	public GetUserDTO(String name, String email, String phone, String cnpj, String cpf) {
		this.name = name;
		this.email = email;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
