package ufpb.br.builder;

public class ItemSale {
	
	private int amount;
	private Product product;
	
	public ItemSale(int amount, Product product) {
		this.amount = amount;
		this.product = product;
	}
	
	public ItemSale() {
		
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String toString() {
		return "ItemSale: " + amount + product.toString();
	}
	
	

}
