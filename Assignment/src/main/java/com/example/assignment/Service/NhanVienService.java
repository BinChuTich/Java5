package com.example.assignment.Service;

import com.example.assignment.Model.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface NhanVienService {
    List<NhanVien> getAll();

    void delete(UUID id);

    NhanVien detail(UUID id);

    NhanVien update(UUID id, NhanVien nhanVien);

    NhanVien Add(NhanVien nhanVien);
}
