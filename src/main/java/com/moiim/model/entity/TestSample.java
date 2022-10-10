package com.moiim.model.entity;

import com.moiim.model.dto.TestSampleDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class TestSample {

    @Id
    private long id;

    private String code;

    private String name;

    public TestSample(){}

    public TestSample(TestSampleDto testSampleDto){
        this.fromEntity(testSampleDto);
    }

    public TestSampleDto toDto(){
        TestSampleDto testSampleDto = new TestSampleDto();
        testSampleDto.setId(id);
        testSampleDto.setCode(code);
        testSampleDto.setName(name);

        return testSampleDto;
    }

    public void fromEntity(TestSampleDto testSampleDto){

        BeanUtils.copyProperties(testSampleDto, this);

    }
}
