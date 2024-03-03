package com.example.assignment.Respository;

import com.example.assignment.Model.HoaDon;
import com.example.assignment.Model.HoaDonChiTiet;
import com.example.assignment.Model.IdHoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, UUID> {

    @Query(value = "select * from hoa_don_chi_tiet", nativeQuery = true)
    List<HoaDonChiTiet> getAll();

}
