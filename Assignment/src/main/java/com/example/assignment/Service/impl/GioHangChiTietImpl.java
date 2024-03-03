package com.example.assignment.Service.impl;

import com.example.assignment.Model.GioHangChiTiet;
import com.example.assignment.Respository.GioHangChiTietRepository;
import com.example.assignment.Service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GioHangChiTietImpl implements GioHangChiTietService {

    @Autowired
    GioHangChiTietRepository gioHangChiTietRepository;

    @Override
    public List<GioHangChiTiet> getAll() {
        return gioHangChiTietRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        gioHangChiTietRepository.deleteById(id);
    }

    @Override
    public Boolean add(GioHangChiTiet gioHangChiTiet) {
        gioHangChiTietRepository.save(gioHangChiTiet);
        return true;
    }

    @Override
    public Boolean update(UUID id, GioHangChiTiet gioHangChiTiet) {
        gioHangChiTietRepository.save(gioHangChiTiet);
        return true;
    }

    @Override
    public GioHangChiTiet detail(UUID id) {
        return gioHangChiTietRepository.findById(id).get();
    }
}
