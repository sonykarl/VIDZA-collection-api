package com.example.vidza.repositories;

import com.example.vidza.entities.ShoeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ShoeTypeRepository extends JpaRepository<ShoeType, BigInteger> {
}
