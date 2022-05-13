package com.revature.SpringERS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "reimbursements")
@Getter @Setter @NoArgsConstructor @Data
public class Reimbursement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "description")
    private  String description;

    @Column(name = "submitted")
    private Timestamp submitted;

    @Column(name = "resolved")
    private  Timestamp resolved;

    @Column(name = "receipt")
    private String receipt;

    @ManyToOne
    private User author;

    @ManyToOne
    private User resolver;

    @ManyToOne
    private ReimbursementStatus status;

    @ManyToOne
    private ReimbursementType type;
}
