package pl.edu.agh.mwo.invoice;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		this.products.add(product);
		// TODO: implement
	}

	public void addProduct(Product product, Integer quantity) {
		if (quantity<=0|| quantity <0){
			throw new IllegalArgumentException("quantity ==0");
		}
		for (int i=0; i < quantity; i++){
			this.products.add(product);
		}
		// TODO: implement
	}

	public BigDecimal getTotalNetPrice() {
		// return BigDecimal.ZERO;
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : this.products){
			sum = sum.add(product.getTotalGrossPrice());
		}
		return sum;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotalGrossPrice() {
		return BigDecimal.ZERO;
	}
}
