package com.moiim.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class UserAccount {

    @Id
    private long accountId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private long accountNum;

    private long bankCode;

    private String bankName;

    private LocalDateTime updateDate;

    private LocalDateTime createDate;

    public UserAccount(){}
}
