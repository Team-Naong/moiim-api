package com.moiim.model.entity;

import com.moiim.model.dto.HistoryType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class History {

    @Id
    private long historyId;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private UserAccount account;

    @Enumerated(EnumType.STRING)
    private HistoryType type;

    private long amount;

    private LocalDateTime createDate;

    public History(){}
}
