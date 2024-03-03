package com.example.assignment.Service.impl;

import com.example.assignment.Model.GioHang;
import com.example.assignment.Respository.GioHangReposirory;
import com.example.assignment.Service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GioHangImpl implements GioHangService {
    @Autowired
    GioHangReposirory gioHangReposirory;

    @Override
    public List<GioHang> getAll() {
        return gioHangReposirory.findAll();
    }

    @Override
    public GioHang add(GioHang gioHang) {
        return gioHangReposirory.save(gioHang);
    }

    @Override
    public void delete(UUID id) {
        gioHangReposirory.deleteById(id);
    }

    @Override
    public GioHang detail(UUID id) {
        return gioHangReposirory.findById(id).get();
    }
}
