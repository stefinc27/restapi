package net.codejava;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	private Integer idproduct;
	private String name;
	private float price;

	public Product() {

	}

	public Product(Integer idproduct, String name, float price) {
		this.idproduct = idproduct;
		this.name = name;
		this.price = price;
	}
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(Integer idproduct) {
		this.idproduct = idproduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
