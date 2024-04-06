package com.main.dmiFinance.repositories;


import com.main.dmiFinance.models.BureauData;
import com.main.dmiFinance.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BureauDataRepository extends JpaRepository<BureauData,Long> {
}
