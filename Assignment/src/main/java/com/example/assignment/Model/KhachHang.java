package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "khach_hang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String ma;
    private String ten;
    private String ten_dem;
    private String ho;
    private String ngay_sinh;
    private String sdt;
    private String dia_chi;
    private String thanh_pho;
    private String quoc_gia;
    private String mat_khau;
}
