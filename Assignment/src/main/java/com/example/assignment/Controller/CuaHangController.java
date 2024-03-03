package com.example.assignment.Controller;

import com.example.assignment.Model.CuaHang;
import com.example.assignment.Service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cuahang")
public class CuaHangController {
    @Autowired
    CuaHangService cuaHangService;

    @GetMapping("/hienthi")
    public String CuaHang(Model model) {
        List<CuaHang> lstCuaHang = cuaHangService.getAll();
        model.addAttribute("lstCuaHang", lstCuaHang);
        model.addAttribute("cuaHang", new CuaHang());
        return "cuahang";
    }

    @GetMapping("/delete/{id}")
    public String DeleteCuaHang(@PathVariable String id) {
        cuaHangService.delete(UUID.fromString(id));
        return "redirect:/cuahang/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTietCuaHang(@PathVariable String id, Model model) {
        CuaHang cuaHang = cuaHangService.detail(UUID.fromString(id));
        model.addAttribute("cuaHang", cuaHang);
        return "cuahangchitiet";

    }

    @PostMapping("/add")
    public String ThemCuaHang(@ModelAttribute("cuaHang") CuaHang ch) {
        cuaHangService.Add(ch);
        return "redirect:/cuahang/hienthi";
    }

    @PostMapping("/update/{id}")
    public String SuaCuaHang(@PathVariable String id, CuaHang cuaHang) {
        cuaHangService.Update(UUID.fromString(id), cuaHang);
        return "redirect:/cuahang/hienthi";
    }
}
