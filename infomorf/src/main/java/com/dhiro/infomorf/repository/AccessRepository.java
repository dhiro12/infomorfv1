package com.dhiro.infomorf.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiro.infomorf.model.AccessibilitiesModel;

public interface AccessRepository extends JpaRepository<AccessibilitiesModel, Long> {

	List<AccessibilitiesModel> findByRoleCode(String roleCode);
}
