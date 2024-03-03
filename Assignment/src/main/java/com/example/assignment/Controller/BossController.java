package com.example.assignment.Controller;

import com.example.assignment.Model.SanPhamChiTiet;
import com.example.assignment.Service.MuaSanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Assignment")
public class BossController {

    @Autowired
    MuaSanPham muaSanPham;

    @GetMapping("/show")
    public String Show(Model model) {
        List<SanPhamChiTiet> sp = muaSanPham.getAll();
        model.addAttribute("lstSanPhamChiTiet", sp);
        model.addAttribute("sanPhamChiTiet", new SanPhamChiTiet());
        return "home";
    }


}
