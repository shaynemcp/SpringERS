package com.revature.SpringERS.dao;

import com.revature.SpringERS.model.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ReimbRepo extends JpaRepository<Reimbursement, Integer> {

    public abstract Set<Reimbursement> findByAuthorId(int authorId);

    public abstract Set<Reimbursement> findByResolverId (int resolverId);

    public abstract Set<Reimbursement> findByStatusId(int statusId);

    public abstract List<Reimbursement> findAll();


}
