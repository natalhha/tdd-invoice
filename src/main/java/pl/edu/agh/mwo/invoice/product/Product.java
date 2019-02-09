package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

import org.hamcrest.number.BigDecimalCloseTo;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		if (name==null) {
			throw new IllegalArgumentException("null box");
		}
		if (price==null){
			throw new IllegalArgumentException("nulll");
		}
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
			if(name.equals("")){
				throw new IllegalArgumentException("empty box");
			}
			if(price.equals(null)||this.price.compareTo(BigDecimal.ZERO)<0){
				throw new IllegalArgumentException("empty box");
			}
			
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		BigDecimal result = this.price.add(this.price.multiply(this.taxPercent));
		return result;
	}
}
