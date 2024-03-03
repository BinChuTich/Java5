package com.example.assignment.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.mapping.Join;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Embeddable
public class IdHoaDonChiTiet implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon id_hoa_don;

    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_sp")
    private SanPhamChiTiet idChiTietSanPham;
}
