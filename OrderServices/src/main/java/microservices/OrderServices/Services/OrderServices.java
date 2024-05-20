package microservices.OrderServices.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import microservices.OrderServices.Entity.OrderEntity;
import microservices.OrderServices.Model.OrderModel;
import microservices.OrderServices.Repository.OrderRepo;

@Service
public class OrderServices {
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	public void createOrder(OrderModel orderModel) {
		OrderEntity orderEntity = modelMapper.map(orderModel, OrderEntity.class);
		orderRepo.save(orderEntity);
		kafkaTemplate.send("createOrder",orderEntity);
	}
}
