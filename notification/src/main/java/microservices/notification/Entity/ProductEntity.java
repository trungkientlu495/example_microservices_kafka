package microservices.notification.Entity;

import lombok.Data;

@Data
public class ProductEntity {
	private Integer id;
	private String name;
	private String description;
	private double price;
}
