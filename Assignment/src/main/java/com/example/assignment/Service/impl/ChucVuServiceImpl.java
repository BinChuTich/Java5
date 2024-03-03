package com.example.assignment.Service.impl;

import com.example.assignment.Model.ChucVu;
import com.example.assignment.Respository.ChucVuRepository;
import com.example.assignment.Service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {

    @Autowired
    ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        chucVuRepository.deleteById(id);
    }

    @Override
    public ChucVu detail(UUID id) {
        return chucVuRepository.findById(id).get();
    }

    @Override
    public ChucVu Add(ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }

    @Override
    public ChucVu Update(UUID id, ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }


}
