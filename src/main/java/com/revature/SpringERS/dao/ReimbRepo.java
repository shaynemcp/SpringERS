package com.revature.SpringERS.dao;

import com.revature.SpringERS.model.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReimbRepo extends JpaRepository<Reimbursement, Integer> {
}
