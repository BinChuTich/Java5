package com.example.assignment.Service;

import com.example.assignment.Model.HoaDonChiTiet;
import com.example.assignment.Model.IdHoaDonChiTiet;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface HoaDonChiTietService {

    List<HoaDonChiTiet> getALl();

    void delete(UUID id);

    HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet);
}
