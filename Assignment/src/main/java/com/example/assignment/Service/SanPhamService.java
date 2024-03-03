package com.example.assignment.Service;

import com.example.assignment.Model.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();

    void delete(UUID id);

    Boolean add(SanPham sanPham);

    SanPham detail(UUID id);

    Boolean update(UUID id, SanPham sanPham);
}
