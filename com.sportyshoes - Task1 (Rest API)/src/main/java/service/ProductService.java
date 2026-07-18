package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {
	
	  @Autowired
	    private ProductRepository repo;

	    public List<Product> getAllProducts(){

	        return repo.findAll();

	    }

}
