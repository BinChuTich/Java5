package com.example.assignment.Service.impl;

import com.example.assignment.Model.HoaDon;
import com.example.assignment.Model.SanPham;
import com.example.assignment.Respository.HoaDonReposirory;
import com.example.assignment.Service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    HoaDonReposirory hoaDonReposirory;

    @Override
    public List<HoaDon> getAll() {
        return hoaDonReposirory.findAll();
    }

    @Override
    public Boolean add(HoaDon hoaDon) {
        hoaDonReposirory.save(hoaDon);
        return true;
    }

    @Override
    public Boolean update(UUID id, HoaDon hoaDon) {
        hoaDonReposirory.save(hoaDon);
        return true;
    }

    @Override
    public void delete(UUID id) {
        hoaDonReposirory.deleteById(id);
    }

    @Override
    public HoaDon detail(UUID id) {
        HoaDon hoaDon = hoaDonReposirory.findById(id).get();
        return hoaDon;
    }
}
