package ufpb.br.builder;

public class SaleBuilder {
	
	private Sale sale;
	
	public SaleBuilder() {
		sale = new Sale();
	}
	
	public SaleBuilder date(String date) {
		sale.setDate(date);
		return this;
	}
	
	public SaleBuilder clientPF(String name, String cpf) {
		sale.setClient(new ClientPF(name, cpf));
		return this;
	}
	
	public SaleBuilder clientPJ(String companyName, String cnpj) {
		sale.setClient(new ClientPF(companyName, cnpj));
		return this;
	}
	
	public SaleBuilder Freight(double freight) {
		sale.setFreight(new Freight(freight));
		return this;
	}
	
	public SaleBuilder Employee(String name) {
		sale.setEmployee(new Employee(name));
		return this;
	}
	
	public SaleBuilder Item(int amount, Product product) {
		sale.addItem(new ItemSale(amount, product));
		return this;
	}
	
	public Sale build() {
		return sale;
	}
	
	

}
