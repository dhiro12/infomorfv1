package com.dhiro.infomorf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhiro.infomorf.model.RoleModel;

public interface RolesRepository extends JpaRepository<RoleModel, Long> {
	RoleModel findByRoleCode(String roleCode);
}
