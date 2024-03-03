package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "chi_tiet_sp")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sp", referencedColumnName = "id")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nsx", referencedColumnName = "id")
    private NhaSanXuat nhaSanXuat;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mau_sac", referencedColumnName = "id")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dong_sp", referencedColumnName = "id")
    private DongSanPham dongSanPham;
    private String nam_bh;
    private String mo_ta;
    private Integer so_luong_ton;
    private String gia_nhap;
    private String gia_ban;
}
