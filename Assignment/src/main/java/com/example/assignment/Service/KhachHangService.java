package com.example.assignment.Service;

import com.example.assignment.Model.KhachHang;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAll();

    void delete(UUID id);

    Boolean add(KhachHang khachHang);

    Boolean update(UUID id, KhachHang khachHang);

    KhachHang detail(UUID id);
}
