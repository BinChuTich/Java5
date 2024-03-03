package com.example.assignment.Respository;

import com.example.assignment.Model.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MauSacRepository extends JpaRepository<MauSac, UUID> {
    @Query(value = "select * from mau_sac ", nativeQuery = true)
    List<MauSac> getAll();
}
