package com.example.assignment.Respository;

import com.example.assignment.Model.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
    @Query(value = "select * from cua_hang", nativeQuery = true)
    List<CuaHang> getAll();
}
