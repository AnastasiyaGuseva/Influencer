package com.example.influencer.repository;

import com.example.influencer.model.Influencer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InfluencerRepository extends JpaRepository<Influencer, Long> {
}
