package com.techiteasy.demo.repositories;

import com.techiteasy.demo.models.CIModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CIModuleRepository extends JpaRepository<CIModule, Long> {
}
