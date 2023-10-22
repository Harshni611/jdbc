package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Travelentity;

@Repository
public interface Travelrepository extends JpaRepository<Travelentity,Integer> {

}
