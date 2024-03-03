package com.example.assignment.Respository;

import com.example.assignment.Model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface KhachHangReposirory extends JpaRepository<KhachHang, UUID> {
    @Query(value = "select * from khach_hang", nativeQuery = true)
    List<KhachHang> getALl();
}
