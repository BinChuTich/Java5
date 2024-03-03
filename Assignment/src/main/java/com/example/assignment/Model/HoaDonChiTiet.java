package com.example.assignment.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "hoa_don_chi_tiet")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class HoaDonChiTiet {
    @EmbeddedId

    private IdHoaDonChiTiet id;
    private Integer so_luong;
    private double don_gia;


}
