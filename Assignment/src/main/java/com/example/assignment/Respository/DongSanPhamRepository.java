package com.example.assignment.Respository;

import com.example.assignment.Model.CuaHang;
import com.example.assignment.Model.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DongSanPhamRepository extends JpaRepository<DongSanPham, UUID> {
    @Query(value = "select * from cua_hang", nativeQuery = true)
    List<CuaHang> getAll();
}
