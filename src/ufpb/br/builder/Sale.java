package ufpb.br.builder;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	
	private Client client = new Client();
	private Employee employee = new Employee();
	private Freight freight = new Freight();
	private String date;
	private List<ItemSale> itemsSold = new ArrayList <ItemSale>();
	
	
	public Sale(String date) {
		this.setDate(date);
	}
	
	public Sale() {
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Freight getFreight() {
		return freight;
	}

	public void setFreight(Freight freight) {
		this.freight = freight;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<ItemSale> getItemsSold() {
		return itemsSold;
	}

	public void setItemsSold(List<ItemSale> itemsSold) {
		this.itemsSold = itemsSold;
	}
	
	public void addItem(ItemSale itemSale) {
		itemsSold.add(itemSale);
	}
	
	public String toString() {
		return client.toString() + "\nEmployee: " + employee.getName()+
				"\nFreight: " + freight.getFreight()+
				"\nPurchase date: " + date +
				"\nProducts: " + itemsSold.size();
	}

}
