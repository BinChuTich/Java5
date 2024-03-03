package com.example.assignment.Controller;

import com.example.assignment.Model.NhanVien;
import com.example.assignment.Model.NhanVienReport;
import com.example.assignment.Respository.NhanVienReportRepository;
import com.example.assignment.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;

    @GetMapping("/hienthi")
    public String nhanvien(Model model) {
        List<NhanVien> lstNhanVien = nhanVienService.getAll();
        model.addAttribute("lstNhanVien", lstNhanVien);
        model.addAttribute("nhanVien", new NhanVien());
        return "nhanvien";
    }

    @GetMapping("/deletenhanvien/{id}")
    public String DeleteNhanVien(@PathVariable String id) {
        nhanVienService.delete(UUID.fromString(id));
        return "redirect:/nhanvien/hienthi";
    }

    @GetMapping("/detailnhanvien/{id}")
    public String DetailNhanVien(@PathVariable String id, Model model) {
        NhanVien nhanVien = nhanVienService.detail(UUID.fromString(id));
        model.addAttribute("nhanVien", nhanVien);
        return "nhanviendetail";
    }

    @PostMapping("/suanhanvien/{id}")
    public String SuaNhanVien(@PathVariable String id, @ModelAttribute("nhanVien") NhanVien nv) {
        nhanVienService.update(UUID.fromString(id), nv);
        return "redirect:/nhanvien/hienthi";

    }

    @PostMapping("/add")
    public String ThemNhanVien(@ModelAttribute("nhanVien") NhanVien nv) {
        nhanVienService.Add(nv);
        return "redirect:/nhanvien/hienthi";
    }

    @Autowired
    NhanVienReportRepository nhanVienReportRepository;

    @GetMapping("/nhanvien/report")
    public String NhanVienReport() {
        List<NhanVienReport> nv = nhanVienReportRepository.findAll();
        nv.forEach(x -> System.out.println(x.toString()));
        return null;

    }
}
