package com.example.assignment.Service;

import com.example.assignment.Model.HoaDon;
import com.example.assignment.Model.SanPham;

import java.util.List;
import java.util.UUID;

public interface HoaDonService {
    List<HoaDon> getAll();

    Boolean add(HoaDon hoaDon);

    Boolean update(UUID id, HoaDon hoaDon);

    void delete(UUID id);

    HoaDon detail(UUID id);

}
