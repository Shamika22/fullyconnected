package com.testOne.testOne.repositories;

import com.testOne.testOne.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,Integer> {
}
