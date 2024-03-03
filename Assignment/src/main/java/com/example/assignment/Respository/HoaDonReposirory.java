package com.example.assignment.Respository;

import com.example.assignment.Model.HoaDon;
import com.example.assignment.Model.IdHoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface HoaDonReposirory extends JpaRepository<HoaDon, UUID> {
    @Query(value = "select * from hoa_don", nativeQuery = true)
    List<HoaDon> getALL();
}
