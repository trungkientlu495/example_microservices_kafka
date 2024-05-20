package microservices.ProductServices;

import org.apache.kafka.clients.admin.NewTopic;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ProductServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServicesApplication.class, args);
	}
	
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
	
	@Bean
	NewTopic notification() {
		// topic name, partition numbers, replication number
		return new NewTopic("createProduct", 1, (short) 1);
	}

}
