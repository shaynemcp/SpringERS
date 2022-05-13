package com.revature.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
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
    private LocalDateTime submitted;

    @Column(name = "resolved")
    private  LocalDateTime resolved;

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
