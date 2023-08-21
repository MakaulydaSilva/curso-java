package entities;

public class ImportedProduct extends Product {

	private double custumsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, double custumsFee) {
		super(name, price);
		this.custumsFee = custumsFee;
	}

	public double getCustumsFee() {
		return custumsFee;
	}

	public void setCustumsFee(double custumsFee) {
		this.custumsFee = custumsFee;
	}

	public double priceTotal() {
		return super.getPrice() + custumsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + " $" + String.format("%.2f", priceTotal()) + " (Customs fee: $"
				+ String.format("%.2f", custumsFee) + ")";
	}

}
