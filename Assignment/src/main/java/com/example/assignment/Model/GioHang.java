package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "gio_hang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String id_kh;
    private String id_nv;
    private String ma;
    private String ngay_tao;
    private String ngay_thanh_toan;
    private String ten_nguoi_nhan;
    private String dia_chi;
    private String sdt;
    private int tinh_trang;
}
