package com.mailorderpharma.refill.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url="http://localhost:8081/drugdetailapi",name="drugdetail")
public interface DrugDetailClient {
	@PutMapping("/updateDispatchableDrugStock/{name}/{location}/{quantity}")
	public ResponseEntity<?> updateQuantity(@RequestHeader("Authorization") String token,@PathVariable("name") String name, @PathVariable("location") String location,
			@PathVariable("quantity") int quantity);

}
