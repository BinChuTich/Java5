package com.example.assignment.Service;

import com.example.assignment.Model.CuaHang;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface CuaHangService {
    List<CuaHang> getAll();

    void delete(UUID id);

    CuaHang detail(UUID id);

    CuaHang Add(CuaHang cuaHang);

    CuaHang Update(UUID id, CuaHang cuaHang);
}
