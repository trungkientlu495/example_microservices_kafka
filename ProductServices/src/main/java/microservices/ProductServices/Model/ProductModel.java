package microservices.ProductServices.Model;

import lombok.Data;

@Data
public class ProductModel {
	private Integer id;
	private String name;
	private String description;
	private double price;
}
