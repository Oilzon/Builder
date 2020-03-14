package ufpb.br.builder;

public class ClientPF extends Client{
	
	private String name;
	private String cpf;
	
	public ClientPF (String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public ClientPF () {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Physical person: " + name + ", CPF: " +cpf;
	}
	

}
