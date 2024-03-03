package com.example.assignment.Controller;

import com.example.assignment.Model.GioHang;
import com.example.assignment.Model.GioHangChiTiet;
import com.example.assignment.Model.KhachHang;
import com.example.assignment.Model.NhanVien;
import com.example.assignment.Service.GioHangChiTietService;
import com.example.assignment.Service.GioHangService;
import com.example.assignment.Service.KhachHangService;
import com.example.assignment.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/giohang")
public class GioHangController {
    @Autowired
    GioHangService gioHangService;

    @GetMapping("/hienthi")
    public String GioHang(Model model) {
        List<GioHang> lstGioHang = gioHangService.getAll();
        model.addAttribute("lstGioHang", lstGioHang);
        model.addAttribute("gioHang", new GioHang());
        return "giohang";
    }

    @PostMapping("/add")
    public String ThemGioHang(@ModelAttribute("gioHang") GioHang gioHang) {
        gioHangService.add(gioHang);
        return "redirect:/giohang/hienthi";
    }

    @GetMapping("/delete/{id}")
    public String XoaGioHang(@PathVariable String id) {
        gioHangService.delete(UUID.fromString(id));
        return "redirect:/giohang/hienthi";
    }

    @Autowired
    KhachHangService khachHangService;
    @Autowired
    NhanVienService nhanVienService;

    @PostMapping("/detail/{id}")
    public String ChiTietGioHang(@PathVariable String id, Model model) {
        GioHang gioHang = gioHangService.detail(UUID.fromString(id));
        model.addAttribute("gioHang", gioHang);
        List<KhachHang> kh = khachHangService.getAll();
        model.addAttribute("lstKhachHang", kh);

        List<NhanVien> nv = nhanVienService.getAll();
        model.addAttribute("lstNhanVien", nv);
        return "giohangdetail";
    }

    @Autowired
    GioHangChiTietService gioHangChiTietService;

}
