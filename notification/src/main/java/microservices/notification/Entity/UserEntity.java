package microservices.notification.Entity;

import lombok.Data;

@Data
public class UserEntity {
	private Integer id;
	private String username;
	private String password;
}
