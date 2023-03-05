package com.springboot.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.entity.Drug;

public interface DrugRepository extends JpaRepository<Drug, Integer> {
	List<Drug> findByDrugNameLike(String drugName);
}
