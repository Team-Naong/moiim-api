package com.moiim.service;

import com.moiim.model.dto.TestSampleDto;

import java.util.List;

public interface TestSampleService {
    List<TestSampleDto> findAllTestSample(); // 전체 조회

    TestSampleDto findTestSampleById(Long id); // 한개 데이터 조회

    Long createTestSample(TestSampleDto testSampleDto); // 생성

    void deleteTestSampleById(Long id); // 삭제
}
