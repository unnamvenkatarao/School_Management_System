package com.skilld.application.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.skilld.application.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
