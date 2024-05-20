package microservices.OrderServices;

import org.apache.kafka.clients.admin.NewTopic;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class OrderServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);
	}
	
	@Bean
	NewTopic notification() {
		// topic name, partition numbers, replication number
		return new NewTopic("createOrder", 1, (short) 1);
	}
	
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
