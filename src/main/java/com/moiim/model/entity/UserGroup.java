package com.moiim.model.entity;

import com.moiim.model.dto.UserGroupGrade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class UserGroup {

    @Id
    private long userGroupId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;

    @Enumerated(EnumType.STRING)
    private UserGroupGrade grade;

    private LocalDateTime createDate;

    public UserGroup(){}
}
