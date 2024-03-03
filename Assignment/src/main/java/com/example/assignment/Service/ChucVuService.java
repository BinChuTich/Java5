package com.example.assignment.Service;

import com.example.assignment.Model.ChucVu;

import java.util.List;
import java.util.UUID;

public interface ChucVuService {
    List<ChucVu> getAll();

    void delete(UUID id);

    ChucVu detail(UUID id);

    ChucVu Add(ChucVu chucVu);

    ChucVu Update(UUID id, ChucVu chucVu);

}
