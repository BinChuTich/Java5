package com.example.assignment.Controller;

import com.example.assignment.Model.ChucVu;
import com.example.assignment.Service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/chucvu")
public class ChucVuController {
    @Autowired
    ChucVuService chucVuService;

    @GetMapping("/hienthi")
    public String ChucVu(Model model) {
        List<ChucVu> lstChucVu = chucVuService.getAll();
        model.addAttribute("lstChucVu", lstChucVu);
        model.addAttribute("chucVu", new ChucVu());
        return "chucvu";
    }

    @GetMapping("/delete/{id}")
    public String DeleteChucVu(@PathVariable String id) {
        chucVuService.delete(UUID.fromString(id));
        return "redirect:/chucvu/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTietChucVu(@PathVariable String id, Model model) {
        ChucVu cv = chucVuService.detail(UUID.fromString(id));
        model.addAttribute("chucVu", cv);
        return "chucvuchitiet";
    }

    @PostMapping("/add")
    public String ThemChucVu(@ModelAttribute("chucVu") ChucVu cv) {
        chucVuService.Add(cv);
        return "redirect:/chucvu/hienthi";
    }

    @PostMapping("/update/{id}")
    public String SuaChucVu(@PathVariable String id, @ModelAttribute("chucVu") ChucVu cv) {
        chucVuService.Update(UUID.fromString(id), cv);
        return "redirect:/chucvu/hienthi";
    }
}
