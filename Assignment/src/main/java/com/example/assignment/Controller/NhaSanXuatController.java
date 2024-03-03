package com.example.assignment.Controller;

import com.example.assignment.Model.NhaSanXuat;
import com.example.assignment.Service.NhaSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/nhasanxuat")
public class NhaSanXuatController {
    @Autowired
    NhaSanXuatService nhaSanXuatService;

    @GetMapping("/hienthi")
    public String HienThi(Model model) {
        List<NhaSanXuat> lst = nhaSanXuatService.getAll();
        model.addAttribute("lst", lst);
        model.addAttribute("nhaSanXuat", new NhaSanXuat());
        return "nhasanxuat";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("nhaSanXuat") NhaSanXuat nhaSanXuat) {
        nhaSanXuatService.add(nhaSanXuat);
        return "redirect:/nhasanxuat/hienthi";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        nhaSanXuatService.delete(UUID.fromString(id));
        return "redirect:/nhasanxuat/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        NhaSanXuat nhaSanXuat = nhaSanXuatService.detail(UUID.fromString(id));
        model.addAttribute("nhaSanXuat", nhaSanXuat);
        return "nhasanxuatchitiet";
    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("nhaSanXuat") NhaSanXuat nhaSanXuat) {
        nhaSanXuatService.update(UUID.fromString(id), nhaSanXuat);
        return "redirect:/nhasanxuat/hienthi";
    }
}
