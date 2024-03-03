package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "nhan_vien")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

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
}
