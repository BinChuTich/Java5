package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "hoa_don")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String id_kh;
    private String id_nv;
    private String ma;
    private String ngay_thanh_toan;
    private String ngay_ship;
    private String ngay_nhan;
    private String tinh_trang;
    private String ten_nguoi_nhan;
    private String dia_chi;
    private String sdt;
}
