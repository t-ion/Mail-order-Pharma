package com.mailorderpharma.drugservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**Main class which contains the main function which 
 * triggers the whole application 
 */
@SpringBootApplication
@EnableFeignClients
public class DrugServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugServiceApplication.class, args);
	}

}
