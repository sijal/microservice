package com.springboot.rest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.rest.dto.DrugDetailsDto;
import com.springboot.rest.repositories.DrugRepository;

import lombok.Data;

@Service
public class DrugService {
	@Autowired
	private DrugRepository drugRepository;

	@Transactional(readOnly = true)
	public List<DrugDetailsDto> findDrugs(String drugName) {
		return drugRepository.findByDrugNameLike("%" + drugName + "%").stream().map(drug -> {
			DrugDetailsDto dto = new DrugDetailsDto(drug.getDrugNo(), drug.getDrugName(), drug.getGenericName(),
					drug.getManufacturer(), drug.getExpiryMonth(), drug.getExpiryYear(), drug.getQuantity(),
					drug.getPrice());
			return dto;
		}).collect(Collectors.toList());
	}

}
