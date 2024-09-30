package com.techiteasy.demo.repositories;

import com.techiteasy.demo.models.RemoteController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteControllerRepository extends JpaRepository<RemoteController, Long> {
}
