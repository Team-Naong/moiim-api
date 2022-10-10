package com.moiim.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table
public class Group {

    @Id
    private long groupId;

    private String gname;

    private LocalDateTime updateDate;

    private LocalDateTime createDate;

    public Group(){}
}
