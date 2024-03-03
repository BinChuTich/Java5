package com.example.assignment.Controller;

import com.example.assignment.Model.*;
import com.example.assignment.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/tonghopsanpham")
public class SanPhamChiTietController {
    @Autowired
    MuaSanPham muaSanPham;

    @Autowired
    SanPhamService sanPhamService;
    @Autowired
    NhaSanXuatService nhaSanXuatService;
    @Autowired
    MauSacService mauSacService;
    @Autowired
    DongSanPhamService dongSanPhamService;

    @GetMapping("/hienthi")
    public String HienThi(Model model) {
        List<SanPhamChiTiet> lstSanPhamChiTiet = muaSanPham.getAll();
        model.addAttribute(("lstSanPhamChiTiet"), lstSanPhamChiTiet);
        model.addAttribute("chiTietSanPham", new SanPhamChiTiet());

        List<SanPham> lstSanPham = sanPhamService.getAll();
        model.addAttribute(("lstSanPham"), lstSanPham);

        List<NhaSanXuat> lstNhaSanXuat = nhaSanXuatService.getAll();
        model.addAttribute("nhaSanXuat", lstNhaSanXuat);

        List<MauSac> lstMauSac = mauSacService.getAll();
        model.addAttribute("lstMauSac", lstMauSac);

        List<DongSanPham> lstDongSanPham = dongSanPhamService.getALl();
        model.addAttribute("lstDongSanPham", lstDongSanPham);
        return "muasanpham";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        muaSanPham.delete(UUID.fromString(id));
        return "redirect:/tonghopsanpham/hienthi";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("chiTietSanPham") SanPhamChiTiet sanPhamChiTiet) {
        muaSanPham.add(sanPhamChiTiet);
        return "redirect:/tonghopsanpham/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        SanPhamChiTiet sanPhamChiTiet = muaSanPham.detail(UUID.fromString(id));
        model.addAttribute("sanPhamChiTiet", sanPhamChiTiet);
        return "detailsanphamchitiet";
    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("sanPhamChiTiet") SanPhamChiTiet sanPhamChiTiet) {
        muaSanPham.update(UUID.fromString(id), sanPhamChiTiet);
        return "redirect:/tonghopsanpham/hienthi";
    }
}
