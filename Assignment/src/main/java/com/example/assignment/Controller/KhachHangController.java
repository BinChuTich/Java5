package com.example.assignment.Controller;

import com.example.assignment.Model.KhachHang;
import com.example.assignment.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/hienthi")
    public String KhachHang(Model model) {
        List<KhachHang> lstKhacHang = khachHangService.getAll();
        model.addAttribute("lstKhachHang", lstKhacHang);
        model.addAttribute("khachHang", new KhachHang());
        return "khachhang";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        khachHangService.delete(UUID.fromString(id));
        return "redirect:/khachhang/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        KhachHang kh = khachHangService.detail(UUID.fromString(id));
        model.addAttribute("khachHang", kh);
        return "khachhangdetail";

    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.add(khachHang);
        return "redirect:/khachhang/hienthi";
    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.update(UUID.fromString(id), khachHang);
        return "redirect:/khachhang/hienthi";
    }

}
