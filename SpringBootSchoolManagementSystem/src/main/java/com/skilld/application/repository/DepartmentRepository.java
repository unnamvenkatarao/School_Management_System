package com.skilld.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilld.application.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
