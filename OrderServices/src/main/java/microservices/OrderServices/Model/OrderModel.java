package microservices.OrderServices.Model;

import lombok.Data;
@Data
public class OrderModel {
    private Integer id;
	private Integer idUser;
	private Integer idProduct;
	private Integer quantity;
}
