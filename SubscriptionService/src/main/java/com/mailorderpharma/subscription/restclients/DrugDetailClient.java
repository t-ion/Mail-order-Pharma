package com.mailorderpharma.subscription.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mailorderpharma.subscription.entity.DrugDetails;


@FeignClient(url="http://localhost:8081/drugdetailapi",name="drugdetailapp")
public interface DrugDetailClient {

	@GetMapping("/searchDrugsByName/{name}")
	public DrugDetails getDrugByName(@PathVariable("name") String name);
}
