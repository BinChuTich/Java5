package com.example.assignment.Respository;

import com.example.assignment.Model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, UUID> {
    @Query(value = "select * from nhan_vien", nativeQuery = true)
    List<NhanVien> getAll();


}
