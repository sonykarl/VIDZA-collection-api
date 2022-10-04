package com.example.vidza.repositories;

import com.example.vidza.entities.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ShoeRepository extends CrudRepository<Shoe, BigInteger> {
}
