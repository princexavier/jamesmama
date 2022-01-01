package com.xps.Bills.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xps.Bills.Pojos.AreaMaster;

@Repository
public interface AreaRepo extends JpaRepository<AreaMaster, Long>{

}
