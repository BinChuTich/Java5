package com.example.assignment.Service;

import com.example.assignment.Model.GioHang;

import java.util.List;
import java.util.UUID;

public interface GioHangService {
    List<GioHang> getAll();

    GioHang add(GioHang gioHang);

    void delete(UUID id);

    GioHang detail(UUID id);

}
