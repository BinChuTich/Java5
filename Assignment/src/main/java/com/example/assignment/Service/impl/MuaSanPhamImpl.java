package com.example.assignment.Service.impl;

import com.example.assignment.Model.SanPhamChiTiet;
import com.example.assignment.Respository.SanPhamChiTietRepository;
import com.example.assignment.Service.MuaSanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MuaSanPhamImpl implements MuaSanPham {
    @Autowired
    SanPhamChiTietRepository sanPhamChiTietRepository;

    @Override
    public List<SanPhamChiTiet> getAll() {
        return sanPhamChiTietRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        sanPhamChiTietRepository.deleteById(id);
    }

    @Override
    public SanPhamChiTiet detail(UUID id) {
        SanPhamChiTiet sanPhamChiTiet = sanPhamChiTietRepository.findById(id).get();
        return sanPhamChiTiet;
    }

    @Override
    public Boolean add(SanPhamChiTiet sanPhamChiTiet) {
        sanPhamChiTietRepository.save(sanPhamChiTiet);
        return true;
    }

    @Override
    public Boolean update(UUID id, SanPhamChiTiet sanPhamChiTiet) {
        sanPhamChiTietRepository.save(sanPhamChiTiet);
        return true;
    }
}
