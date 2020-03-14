package ufpb.br.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Teste {
	
	@Test
	void testComBuilder() {
		
		Product jaca = new Product("JACA", 1.00);
		Product uva = new Product("UVA", 3.00);
		Sale sale = new SaleBuilder()
				.date("12/03/2020")
				.clientPF("Juan", "11111111111")
				.Item(2, jaca)
				.Item(4, uva)
				.build();
		
		assertEquals("Physical person: Name: Juan, CPF: 11111111111" +
				"\nEmployee: null" +
				"\nFreight: 0.0" +
				"\nPurchase date 12/03/2020" +
				"\nProduct description: 2", sale.toString());
		
	}
	
	@Test
	void testComBuilder1() {
		
		Product carro = new Product("carro", 25.000);
		Product bike = new Product("bike", 1.000);
		Sale sale = new SaleBuilder()
				.date("12/03/2020")
				.Employee("Carlos")
				.Freight(0.0)
				.clientPJ("BrazMotors", "11111111111111")
				.Item(1, carro)
				.Item(1, bike)
				.build();
		
		assertEquals("Legal person: companyName: BrazMotors , CNPJ: 11111111111111" +
				"\nEmployee: Carlos" +
				"\nFreight: 0.0" +
				"\nPurchase date 12/03/2020" +
				"\nProduct description: 2", sale.toString());
		
	}
	
	

}
