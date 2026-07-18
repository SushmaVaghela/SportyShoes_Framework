package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductApiController {
	
	  @Autowired
	    private ProductService service;

	    @GetMapping
	    public List<Product> getProducts(){

	        return service.getAllProducts();

	    }

}
