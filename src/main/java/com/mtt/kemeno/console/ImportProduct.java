package com.mtt.kemeno.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mtt.kemeno.models.Product;
import com.mtt.kemeno.repositories.ProductRepository;


@Component
public class ImportProduct implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repository = null;
	


	@Override
	public void run(String... args) throws Exception {
		
		for (int i=0; i<1000000; i++) {
			Product p = new Product();
			p.setCode("P" + i);
			p.setIsActive(true);
			this.repository.save(p);
		}
		
		
	}

}
