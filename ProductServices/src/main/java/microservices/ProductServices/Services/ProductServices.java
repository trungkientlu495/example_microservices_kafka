package microservices.ProductServices.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import microservices.ProductServices.Entity.ProductEntity;
import microservices.ProductServices.Model.ProductModel;
import microservices.ProductServices.Repository.ProductRepo;

@Service
public class ProductServices {
	@Autowired
	ProductRepo productRepo;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	public void createProduct(ProductModel productModel) {
		ProductEntity productEntity = modelMapper.map(productModel, ProductEntity.class);
		productRepo.save(productEntity);
		kafkaTemplate.send("createProduct",productEntity);
	}
}
