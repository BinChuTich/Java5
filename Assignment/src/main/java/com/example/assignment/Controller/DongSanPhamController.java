package com.example.assignment.Controller;

import com.example.assignment.Model.DongSanPham;
import com.example.assignment.Service.DongSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/dongsanpham")
public class DongSanPhamController {
    @Autowired
    DongSanPhamService dongSanPhamService;

    @GetMapping("/hienthi")
    public String DongSanPham(Model model) {
        List<DongSanPham> lstDongSanPham = dongSanPhamService.getALl();
        model.addAttribute("lstDongSanPham", lstDongSanPham);
        model.addAttribute("dongSanPham", new DongSanPham());
        return "dongsanpham";
    }

    @GetMapping("/delete/{id}")
    public String DeleteDongSanPham(@PathVariable String id) {
        dongSanPhamService.delete(UUID.fromString(id));
        return "redirect:/dongsanpham/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTietSanPham(@PathVariable String id, Model model) {
        DongSanPham dsp = dongSanPhamService.detail(UUID.fromString(id));
        model.addAttribute("dongSanPham", dsp);
        return "dongsanphamchitiet";
    }

    @PostMapping("/add")
    public String ThemSanPham(@ModelAttribute("dongSanPham") DongSanPham dongSanPham) {
        dongSanPhamService.add(dongSanPham);
        return "redirect:/dongsanpham/hienthi";
    }

    @PostMapping("/update/{id}")
    public String SuaSanPham(@PathVariable String id, @ModelAttribute("dongSanPham") DongSanPham dongSanPham) {
        dongSanPhamService.update(UUID.fromString(id), dongSanPham);
        return "redirect:/dongsanpham/hienthi";
    }
}
