package com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.dto.DrugDetailsDto;
import com.springboot.rest.service.DrugService;

@RestController
@RequestMapping("/drug")
@RefreshScope
public class DrugApiController {
	private final DrugService drugService;
	@Value("${pharmacy.active.profile.test}")
	private String profileTest;
	
	public DrugApiController(DrugService drugService) {
		this.drugService = drugService;
	}

	@GetMapping(value = "/{drugName}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<DrugDetailsDto> findDrugs(@PathVariable("drugName") String drugName) {
		System.out.println("profileTest :: " + profileTest);
		return drugService.findDrugs(drugName);
	}
}
