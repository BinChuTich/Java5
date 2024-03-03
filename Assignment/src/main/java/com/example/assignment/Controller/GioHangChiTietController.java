package com.example.assignment.Controller;

import com.example.assignment.Model.GioHang;
import com.example.assignment.Model.GioHangChiTiet;
import com.example.assignment.Service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/giohangchitiet")
public class GioHangChiTietController {
    @Autowired
    GioHangChiTietService gioHangChiTietService;

    @GetMapping("/hienthi")
    public String GioHangChiTiet(Model model) {
        List<GioHangChiTiet> lstGioHangChiTiet = gioHangChiTietService.getAll();
        model.addAttribute("lstGioHangChiTiet", lstGioHangChiTiet);
        model.addAttribute("gioHangChiTiet", new GioHangChiTiet());
        return "giohangchitiet";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        gioHangChiTietService.delete(UUID.fromString(id));
        return "redirect:/giohangchitiet/hienthi";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("gioHangChiTiet") GioHangChiTiet gioHangChiTiet) {
        gioHangChiTietService.add(gioHangChiTiet);
        return "redirect:/giohangchitiet/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("gioHangChiTiet", new GioHangChiTiet());
        return "giohangchitietdetail";
    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("gioHangChiTiet") GioHangChiTiet gioHangChiTiet) {
        gioHangChiTietService.update(UUID.fromString(id), gioHangChiTiet);
        return "redirect:/giohangchitiet/hienthi";
    }

}
