package com.example.assignment.Service.impl;

import com.example.assignment.Model.KhachHang;
import com.example.assignment.Respository.KhachHangReposirory;
import com.example.assignment.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KhachHangImpl implements KhachHangService {
    @Autowired
    KhachHangReposirory khachHangReposirory;

    @Override
    public List<KhachHang> getAll() {
        return khachHangReposirory.findAll();
    }

    @Override
    public void delete(UUID id) {
        khachHangReposirory.deleteById(id);
    }

    @Override
    public Boolean add(KhachHang khachHang) {
        khachHangReposirory.save(khachHang);
        return true;
    }

    @Override
    public Boolean update(UUID id, KhachHang khachHang) {
        khachHangReposirory.save(khachHang);
        return true;
    }

    @Override
    public KhachHang detail(UUID id) {
        KhachHang kh = khachHangReposirory.findById(id).get();
        return kh;
    }
}
