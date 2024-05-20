package microservices.notification.Entity;

import lombok.Data;

@Data
public class OrderEntity {
	private Integer id;
	private Integer idUser;
	private Integer idProduct;
	private Integer quantity;
}
