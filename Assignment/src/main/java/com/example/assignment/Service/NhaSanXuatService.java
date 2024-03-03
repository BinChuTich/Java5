package com.example.assignment.Service;

import com.example.assignment.Model.NhaSanXuat;

import java.util.List;
import java.util.UUID;

public interface NhaSanXuatService {
    List<NhaSanXuat> getAll();

    void delete(UUID id);

    Boolean add(NhaSanXuat nhaSanXuat);

    NhaSanXuat detail(UUID id);

    Boolean update(UUID id, NhaSanXuat nhaSanXuat);

}
