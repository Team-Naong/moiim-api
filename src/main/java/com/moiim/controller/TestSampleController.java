package com.moiim.controller;

import com.moiim.model.dto.TestSampleDto;
import com.moiim.service.TestSampleService;
import com.moiim.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moiim")
public class TestSampleController {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestSampleController.class);
    private final TestSampleService testSampleService;

    public TestSampleController(TestSampleService testSampleService) {
        this.testSampleService = testSampleService;
    }

    /**
     * 테스트 샘플 목록 조회
     * @return
     */
    @GetMapping
    public List<TestSampleDto> findAllTestSample(){ return testSampleService.findAllTestSample(); }

    /**
     * 테스트 샘플 단건 조회
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public TestSampleDto findTestSampleById(@PathVariable(name="id") Long id){
        return testSampleService.findTestSampleById(id);
    }

    @PostMapping
    public Long createTestSample(@RequestBody TestSampleDto testSampleDto){
        LOGGER.debug("createTestSample testSampleDto====>{}", JsonUtil.toJson(testSampleDto));
        return testSampleService.createTestSample(testSampleDto);
    }

    @DeleteMapping("{id}")
    public void deleteTestSampleById(@PathVariable(name="id") Long id){
        testSampleService.deleteTestSampleById(id);
    }
}
