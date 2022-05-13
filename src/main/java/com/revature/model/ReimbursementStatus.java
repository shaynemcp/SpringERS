package com.revature.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "reimb_status")
@NoArgsConstructor @Getter @Setter @Data
public class ReimbursementStatus {

    @Id
    @GeneratedValue
    @Column(name = "reimb_status_id")
    private int id;

    @Column(name = "status")
    private String status;
}
