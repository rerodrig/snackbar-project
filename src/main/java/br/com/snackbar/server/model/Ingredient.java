package br.com.snackbar.server.model;

import java.math.BigDecimal;

public class Ingredient {

	private Integer id;
	private String name;
	private BigDecimal price;
	private DiscountType discountType;

	public Ingredient() {

	}

	public Ingredient(final Integer id, final String name, final BigDecimal price, final DiscountType discountType) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountType = discountType;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public DiscountType getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(final DiscountType discountType) {
		this.discountType = discountType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.discountType == null ? 0 : this.discountType.hashCode());
		result = prime * result + (this.id == null ? 0 : this.id.hashCode());
		result = prime * result + (this.name == null ? 0 : this.name.hashCode());
		result = prime * result + (this.price == null ? 0 : this.price.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Ingredient other = (Ingredient) obj;
		if (this.discountType != other.discountType) {
			return false;
		}
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!this.price.equals(other.price)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + this.id + ", name=" + this.name + ", price=" + this.price + ", discountType="
				+ this.discountType + "]";
	}

}
