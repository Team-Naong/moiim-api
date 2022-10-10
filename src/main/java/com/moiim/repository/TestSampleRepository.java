package com.moiim.repository;

import com.moiim.model.entity.TestSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestSampleRepository extends JpaRepository<TestSample, Long> {
    TestSample findByCode(String code);
}
