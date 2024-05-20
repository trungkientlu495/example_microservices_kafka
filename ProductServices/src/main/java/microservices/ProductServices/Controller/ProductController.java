package microservices.ProductServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.ProductServices.Model.ProductModel;
import microservices.ProductServices.Services.ProductServices;

@RestController
@RequestMapping("/Product")
public class ProductController {
	@Autowired
	ProductServices productServices;
	@PostMapping("/createProduct")
	public void createProduct(@ModelAttribute("productModel") ProductModel productModel) {
		productServices.createProduct(productModel);
	}
}
