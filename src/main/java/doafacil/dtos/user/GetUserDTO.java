package doafacil.dtos.user;

public class GetUserDTO {
	
	private Long id;
	private String name;
    private String email;
    private String phone;
    private String cpf;
    private String cnpj;

	public GetUserDTO(Long id, String name, String email, String phone, String cnpj, String cpf) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}
	
	public GetUserDTO(Long id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}
}
