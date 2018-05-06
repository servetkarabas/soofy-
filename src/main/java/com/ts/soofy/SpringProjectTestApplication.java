package com.ts.soofy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ts.soofy.model.Customer;
import com.ts.soofy.repository.CustomerRepository;

@SpringBootApplication
public class SpringProjectTestApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringProjectTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectTestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(CustomerRepository repository){
		return	(args) -> {
			// save a couples of customers
			repository.save(new Customer("Ali", "Veli"));
			repository.save(new Customer("Hasan", "Huseyin"));
			repository.save(new Customer("AYşe","Fatma"));
			repository.save(new Customer("Ahmet","Kara"));
			repository.save(new Customer("Mehmet","Karabas"));
			repository.save(new Customer("ali","Karaman"));
			
			log.info("Customer found with findAll");
			for(Customer customer : repository.findAll()){
				log.info(customer.toString());
			}
			
			// fetch one customer
			Customer customer = repository.findOne(1L);
			log.info("find customer 1L");
			log.info(customer.toString());
			
			log.info("customer starts with ");
			
			for (Customer kara : repository.findByLastnameStartsWithIgnoreCase("kara")) {
				log.info(kara.toString());
			}
			
		};
		
	}
}
