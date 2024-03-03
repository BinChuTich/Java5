package com.example.assignment.Service;

import com.example.assignment.Model.DongSanPham;

import java.util.List;
import java.util.UUID;

public interface DongSanPhamService {

    List<DongSanPham> getALl();

    void delete(UUID id);

    DongSanPham detail(UUID id);

    Boolean add(DongSanPham dongSanPham);

    Boolean update(UUID id, DongSanPham dongSanPham);
}
