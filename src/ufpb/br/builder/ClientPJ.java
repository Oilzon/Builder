package ufpb.br.builder;

public class ClientPJ extends Client{
	
	private String companyName;
	private String cnpj;
	
	public ClientPJ (String companyName, String cnpj) {
		this.companyName = companyName;
		this.cnpj = cnpj;		
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "Legal person: " + companyName + ", CNPJ: " +cnpj;
	}

}
