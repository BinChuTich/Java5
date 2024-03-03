package com.example.assignment.Controller;

import com.example.assignment.Model.SanPham;
import com.example.assignment.Service.SanPhamService;
import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {

    @Autowired
    SanPhamService sanPhamService;

    @GetMapping("/hienthi")
    public String HienThi(Model model) {
        List<SanPham> lst = sanPhamService.getAll();
        model.addAttribute("lstSanPham", lst);
        model.addAttribute("sanPham", new SanPham());
        return "sanpham";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        sanPhamService.delete(UUID.fromString(id));
        return "redirect:/sanpham/hienthi";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamService.add(sanPham);
        return "redirect:/sanpham/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        SanPham sanPham = sanPhamService.detail(UUID.fromString(id));
        model.addAttribute("sanPham", sanPham);
        return "sanphamchitiet";
    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamService.update(UUID.fromString(id), sanPham);
        return "redirect:/sanpham/hienthi";
    }
}
