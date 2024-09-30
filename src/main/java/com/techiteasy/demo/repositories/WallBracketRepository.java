package com.techiteasy.demo.repositories;

import com.techiteasy.demo.models.WallBracket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallBracketRepository extends JpaRepository<WallBracket, Long> {
}
