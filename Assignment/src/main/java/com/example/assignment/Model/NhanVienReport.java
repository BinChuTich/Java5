package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NhanVienReport {

    @Id
    private UUID id;
    private String ma;
    private String ten;
    private String ten_dem;
    private String ho;
    private String gioi_tinh;
    private String ngay_sinh;
    private String dia_chi;
    private String sdt;
    private String mat_khau;
    private String id_ch;
    private String id_cv;
    private String id_gui_bc;
    private int trang_thai;
    private String ten_cua_hang;
}
