package com.example.assignment.Service;

import com.example.assignment.Model.SanPham;
import com.example.assignment.Model.SanPhamChiTiet;

import java.util.List;
import java.util.UUID;

public interface MuaSanPham {
    List<SanPhamChiTiet> getAll();

    void delete(UUID id);

    SanPhamChiTiet detail(UUID id);

    Boolean add(SanPhamChiTiet sanPhamChiTiet);

    Boolean update(UUID id, SanPhamChiTiet sanPhamChiTiet);
}
