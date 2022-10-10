package com.moiim.service.impl;

import com.moiim.model.dto.TestSampleDto;
import com.moiim.model.entity.TestSample;
import com.moiim.repository.TestSampleRepository;
import com.moiim.service.TestSampleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestSampleServiceImpl implements TestSampleService {

    private final TestSampleRepository testSampleRepository;

    public TestSampleServiceImpl(TestSampleRepository testSampleRepository) {
        this.testSampleRepository = testSampleRepository;
    }

    @Override
    public List<TestSampleDto> findAllTestSample() {
        return testSampleRepository.findAll().stream().map(TestSample::toDto).collect(Collectors.toList());
    }

    @Override
    public TestSampleDto findTestSampleById(Long id) {
        TestSample testSample = testSampleRepository.findById(id).orElse(null);
        return testSample.toDto();
    }

    @Override
    public Long createTestSample(TestSampleDto testSampleDto) {
        TestSample testSample = new TestSample(testSampleDto);

        return testSampleRepository.save(testSample).getId();
    }

    @Override
    public void deleteTestSampleById(Long id) {
        testSampleRepository.deleteById(id);
    }
}
