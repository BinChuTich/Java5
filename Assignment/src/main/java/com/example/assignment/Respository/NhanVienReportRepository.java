package com.example.assignment.Respository;

import com.example.assignment.Model.NhanVienReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NhanVienReportRepository extends JpaRepository<NhanVienReport, UUID> {
    @Query(value = "select nhan_vien.*, cua_hang.ten as'ten_cua_hang'\n" +
            "from nhan_vien\n" +
            "inner join cua_hang on nhan_vien.id_ch=cua_hang.id", nativeQuery = true)
    List<NhanVienReport> findAll();
}
