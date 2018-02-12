package com.wuzhi.sprout.repository;

import com.wuzhi.sprout.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
