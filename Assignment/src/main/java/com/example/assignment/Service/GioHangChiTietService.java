package com.example.assignment.Service;

import com.example.assignment.Model.GioHangChiTiet;

import java.util.List;
import java.util.UUID;

public interface GioHangChiTietService {
    List<GioHangChiTiet> getAll();

    void delete(UUID id);

    Boolean add(GioHangChiTiet gioHangChiTiet);

    Boolean update(UUID id, GioHangChiTiet gioHangChiTiet);

    GioHangChiTiet detail(UUID id);
}
