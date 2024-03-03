package com.example.assignment.Service.impl;

import com.example.assignment.Model.DongSanPham;
import com.example.assignment.Respository.DongSanPhamRepository;
import com.example.assignment.Service.DongSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DongSanPhamImpl implements DongSanPhamService {

    @Autowired
    DongSanPhamRepository dongSanPhamRepository;

    @Override
    public List<DongSanPham> getALl() {
        return dongSanPhamRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        dongSanPhamRepository.deleteById(id);
    }


    @Override
    public DongSanPham detail(UUID id) {
        return dongSanPhamRepository.findById(id).get();
    }

    @Override
    public Boolean add(DongSanPham dongSanPham) {
        dongSanPhamRepository.save(dongSanPham);
        return true;
    }

    @Override
    public Boolean update(UUID id, DongSanPham dongSanPham) {
        dongSanPhamRepository.save(dongSanPham);
        return true;
    }
}
