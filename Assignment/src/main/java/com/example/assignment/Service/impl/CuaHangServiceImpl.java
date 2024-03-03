package com.example.assignment.Service.impl;

import com.example.assignment.Model.CuaHang;
import com.example.assignment.Respository.CuaHangRepository;
import com.example.assignment.Service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CuaHangServiceImpl implements CuaHangService {
    @Autowired
    CuaHangRepository cuaHangRepository;

    @Override
    public List<CuaHang> getAll() {
        return cuaHangRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        cuaHangRepository.deleteById(id);
    }

    @Override
    public CuaHang detail(UUID id) {
        return cuaHangRepository.findById(id).get();
    }

    @Override
    public CuaHang Add(CuaHang cuaHang) {
        return cuaHangRepository.save(cuaHang);
    }

    @Override
    public CuaHang Update(UUID id, CuaHang cuaHang) {
        CuaHang ch = cuaHangRepository.save(cuaHang);
        return ch;
    }


}
