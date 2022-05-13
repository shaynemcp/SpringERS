package com.revature.SpringERS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "reimb_type")
@NoArgsConstructor
@Getter
@Setter
@Data
public class ReimbursementType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reimb_type_id")
    private int id;

    @Column(name = "type")
    private String type;
}
