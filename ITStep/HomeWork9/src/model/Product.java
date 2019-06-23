package model;

public class Product {
	static int products = 0;
	private String brand;
	private String model;
	private String type;
	private double cost;
	private String color;
	private int weight;
	private int length;
	private int width;
	private int height;

	private String condition;// new, used, discounted
	private double warranty_period;// month

	public Product() {
		products++;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", model=" + model + ", type=" + type + ", cost=" + cost + ", color=" + color
				+ ", weight=" + weight + ", length=" + length + ", width=" + width + ", height=" + height
				+ ", condition=" + condition + ", warranty_period=" + warranty_period + "]";
	}

}
