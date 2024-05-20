package microservices.OrderServices.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private Integer idUser;
	private Integer idProduct;
	private Integer quantity;
	
}
