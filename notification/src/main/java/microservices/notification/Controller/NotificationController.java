package microservices.notification.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.notification.Services.NotificationServices;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	@Autowired
	NotificationServices notificationServices;
	@GetMapping("/createUser")
	public ResponseEntity<String> notificationcreateUser() {
		return ResponseEntity.ok().body(notificationServices.notificationCreateUser());
	}
	
	@GetMapping("/createProduct")
	public ResponseEntity<String> notificationcreateProduct() {
		return ResponseEntity.ok().body(notificationServices.notificationCreateProduct());
	}
	
	@GetMapping("/createOrder")
	public ResponseEntity<String> notificationcreateOrder() {
		return ResponseEntity.ok().body(notificationServices.notificationCreateOrder());
	}
}
