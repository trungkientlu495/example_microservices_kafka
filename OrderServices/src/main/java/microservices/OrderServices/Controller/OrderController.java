package microservices.OrderServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.OrderServices.Model.OrderModel;
import microservices.OrderServices.Services.OrderServices;
@RestController
@RequestMapping("/Order")
public class OrderController {
	@Autowired
	OrderServices orderServices;
	@PostMapping("/createOrder")
	public void createOrder(@ModelAttribute("orderModel") OrderModel orderModel) {
		orderServices.createOrder(orderModel);
	}
}
