package microservices.UserServices;

import org.apache.kafka.clients.admin.NewTopic;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class UserServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServicesApplication.class, args);
	}
	
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
	
	@Bean
	NewTopic notification() {
		// topic name, partition numbers, replication number
		return new NewTopic("createUser", 1, (short) 1);
	}
	
	@Bean
	NewTopic tongUser() {
		// topic name, partition numbers, replication number
		return new NewTopic("tongUser", 1, (short) 1);
	}

}
