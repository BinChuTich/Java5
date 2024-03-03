package com.example.assignment.Service.impl;

import com.example.assignment.Model.MauSac;
import com.example.assignment.Respository.MauSacRepository;
import com.example.assignment.Service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MauSacImpl implements MauSacService {
    @Autowired
    MauSacRepository mauSacRepository;

    @Override
    public List<MauSac> getAll() {
        return mauSacRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        mauSacRepository.deleteById(id);
    }

    @Override
    public Boolean add(MauSac mauSac) {
        mauSacRepository.save(mauSac);
        return true;
    }

    @Override
    public MauSac detail(UUID id) {
        MauSac mauSac = mauSacRepository.findById(id).get();
        return mauSac;
    }

    @Override
    public Boolean update(UUID id, MauSac mauSac) {
        mauSacRepository.save(mauSac);
        return true;
    }
}
