package com.example.assignment.Service.impl;

import com.example.assignment.Model.SanPham;
import com.example.assignment.Respository.SanPhamRepository;
import com.example.assignment.Service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SanPhamImpl implements SanPhamService {

    @Autowired
    SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        sanPhamRepository.deleteById(id);
    }

    @Override
    public Boolean add(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return true;
    }

    @Override
    public SanPham detail(UUID id) {
        SanPham sanPham = sanPhamRepository.findById(id).get();
        return sanPham;
    }

    @Override
    public Boolean update(UUID id, SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return true;
    }
}
