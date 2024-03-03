package com.example.assignment.Respository;

import com.example.assignment.Model.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet, UUID> {
    @Query(value = "select * from gio_hang_chi_tiet", nativeQuery = true)
    List<GioHangChiTiet> getALL();
}
