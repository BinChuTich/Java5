package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "gio_hang_chi_tiet")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class GioHangChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_gio_hang;
    private UUID id_chi_tiet_sp;
    private int so_luong;
    private double don_gia;
    private double don_gia_khi_giam;
}
