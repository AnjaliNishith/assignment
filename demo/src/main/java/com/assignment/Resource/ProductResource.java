package  com.assignment.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.bean.Item;
import com.assignment.service.WeatherService;

@RestController
public class ProductResource {

	@Autowired
	private WeatherService productService;
	
	@RequestMapping("/products")
	public String getAllProducts(String zip){
		return productService.getAllProducts(zip);
	}
}
