package com.example.assignment.Service.impl;

import com.example.assignment.Model.HoaDon;
import com.example.assignment.Model.HoaDonChiTiet;
import com.example.assignment.Model.IdHoaDonChiTiet;
import com.example.assignment.Respository.HoaDonChiTietRepository;
import com.example.assignment.Service.HoaDonChiTietService;
import com.example.assignment.Service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class HoaDonChiTietImpl implements HoaDonChiTietService {
    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;

    @Override
    public List<HoaDonChiTiet> getALl() {
        return hoaDonChiTietRepository.findAll();
    }

    @Override
    public void delete(UUID id) {

        hoaDonChiTietRepository.deleteById(id);
    }

    @Override
    public HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet) {
        return hoaDonChiTietRepository.save(hoaDonChiTiet);
    }
}
