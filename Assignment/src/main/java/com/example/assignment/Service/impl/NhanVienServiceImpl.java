package com.example.assignment.Service.impl;

import com.example.assignment.Model.NhanVien;
import com.example.assignment.Respository.NhanVienRepository;
import com.example.assignment.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public NhanVien detail(UUID id) {
        return nhanVienRepository.findById(id).get();
    }

    @Override
    public NhanVien update(UUID id, NhanVien nhanVien) {
        NhanVien nv = nhanVienRepository.save(nhanVien);
        return nv;
    }

    @Override
    public NhanVien Add(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }


}
