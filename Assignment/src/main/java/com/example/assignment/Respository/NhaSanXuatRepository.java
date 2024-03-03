package com.example.assignment.Respository;

import com.example.assignment.Model.NhaSanXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface NhaSanXuatRepository extends JpaRepository<NhaSanXuat, UUID> {
    @Query(value = "select * from nha_san_xuat", nativeQuery = true)
    List<NhaSanXuat> getAll();
}
