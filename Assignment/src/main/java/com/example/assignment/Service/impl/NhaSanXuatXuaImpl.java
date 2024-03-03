package com.example.assignment.Service.impl;

import com.example.assignment.Model.NhaSanXuat;
import com.example.assignment.Respository.NhaSanXuatRepository;
import com.example.assignment.Service.NhaSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhaSanXuatXuaImpl implements NhaSanXuatService {

    @Autowired
    NhaSanXuatRepository nhaSanXuatRepository;

    @Override
    public List<NhaSanXuat> getAll() {
        return nhaSanXuatRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        nhaSanXuatRepository.deleteById(id);
    }

    @Override
    public Boolean add(NhaSanXuat nhaSanXuat) {
        nhaSanXuatRepository.save(nhaSanXuat);
        return true;
    }

    @Override
    public NhaSanXuat detail(UUID id) {
        NhaSanXuat nhaSanXuat = nhaSanXuatRepository.findById(id).get();
        return nhaSanXuat;
    }

    @Override
    public Boolean update(UUID id, NhaSanXuat nhaSanXuat) {
        nhaSanXuatRepository.save(nhaSanXuat);
        return true;
    }
}
