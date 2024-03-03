package com.example.assignment.Service;

import com.example.assignment.Model.MauSac;

import java.util.List;
import java.util.UUID;

public interface MauSacService {
    List<MauSac> getAll();

    void delete(UUID id);

    Boolean add(MauSac mauSac);

    MauSac detail(UUID id);

    Boolean update(UUID id, MauSac mauSac);


}
