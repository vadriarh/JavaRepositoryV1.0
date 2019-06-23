package test;

import java.util.ArrayList;
import java.util.List;

enum Priority{
	LOW,MIDDLE,HIGHT,EXTRA_TOP
}

public class Product {
private int id;
private Priority priority;
private String name;
private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Priority getPriority() {
	return priority;
}
public void setPriority(Priority priority) {
	this.priority = priority;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Product(int id, Priority priority, String name, double price) {
	super();
	this.id = id;
	this.priority = priority;
	this.name = name;
	this.price = price;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((priority == null) ? 0 : priority.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	Product other = (Product) obj;
	if (id != other.id) {
		return false;
	}
	if (name == null) {
		if (other.name != null) {
			return false;
		}
	} else if (!name.equals(other.name)) {
		return false;
	}
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
		return false;
	}
	if (priority != other.priority) {
		return false;
	}
	return true;
}
@Override
public String toString() {
	return "Product [id=" + id + ", priority=" + priority + ", name=" + name + ", price=" + price + "]";
}



}

class Shop{
	
	static List<Product> shopSession(List<Product> products,double cash){
		List<Product> newProducts=new ArrayList<Product>();
		for (int i = Priority.values().length-1; i >=0 ; i++) {
			for (int j = 0; j < products.size(); j++) {
				if(products.get(j).getPriority().equals(Priority.values()[i])) {
					//if
				}
			}
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		List<Product> products=new ArrayList<Product>();
		
	}
}
