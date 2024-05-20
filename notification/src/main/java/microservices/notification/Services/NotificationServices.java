package microservices.notification.Services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import microservices.notification.Entity.OrderEntity;
import microservices.notification.Entity.ProductEntity;
import microservices.notification.Entity.UserEntity;

@Service
public class NotificationServices {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	List<UserEntity> userEntities = new ArrayList<UserEntity>();
	List<ProductEntity> productEntities = new ArrayList<ProductEntity>();
	List<OrderEntity> orderEntities = new ArrayList<OrderEntity>();
	@KafkaListener(id = "notification_createUser",topics = "createUser")
	public void notification_createUser(UserEntity userEntity) {
		//logger.info("Received: " + userEntity.getUsername());
		userEntities.add(userEntity);
		for (UserEntity userEntitya : userEntities) {
			logger.info("Received: " + userEntitya.getUsername());
		}
	}
	
	public String notificationCreateUser() {
		if(userEntities!=null) 
			return "THEM USER THANH CONG";
		return "THEM USER THAT BAI";
	}
	
	@KafkaListener(id = "notification_createProduct",topics = "createProduct")
	public void notification_createProduct(ProductEntity productEntity) {
		//logger.info("Received: " + userEntity.getUsername());
		productEntities.add(productEntity);
		for (ProductEntity productEntitya : productEntities) {
			logger.info("ReceivedPRODUCT: " + productEntity.getName());
		}
	}
	
	public String notificationCreateProduct() {
		if(userEntities!=null) 
			return "THEM PRODUCT THANH CONG";
		return "THEM PRODUCT THAT BAI";
	}
	
	@KafkaListener(id = "notification_createOrder",topics = "createOrder")
	public void notification_createOrder(OrderEntity orderEntity) {
		//logger.info("Received: " + userEntity.getUsername());
		orderEntities.add(orderEntity);
		for (OrderEntity orderEntitya : orderEntities) {
			logger.info("ReceivedOrder: " + orderEntity.getQuantity());
		}
	}
	
	public String notificationCreateOrder() {
		if(orderEntities!=null) 
			return "THEM ORDER THANH CONG";
		return "THEM ORDER THAT BAI";
	}
	
	
}
