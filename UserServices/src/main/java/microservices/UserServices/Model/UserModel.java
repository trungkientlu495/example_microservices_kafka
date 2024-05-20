package microservices.UserServices.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserModel {
	private Integer id;
	private String username;
	private String password;
}
