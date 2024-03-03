package com.example.assignment.Controller;

import com.example.assignment.Model.MauSac;
import com.example.assignment.Service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/mausac")
public class MauSacController {
    @Autowired
    MauSacService mauSacService;

    @GetMapping("/hienthi")
    public String HienThi(Model model) {
        List<MauSac> lst = mauSacService.getAll();
        model.addAttribute("lstMau", lst);
        model.addAttribute("mauSac", new MauSac());
        return "mausac";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("mauSac") MauSac mauSac) {
        mauSacService.add(mauSac);
        return "redirect:/mausac/hienthi";
    }

    @GetMapping("/delete/{id}")
    public String Delete(@PathVariable String id) {
        mauSacService.delete(UUID.fromString(id));
        return "redirect:/mausac/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        MauSac mauSac = mauSacService.detail(UUID.fromString(id));
        model.addAttribute("mauSac", mauSac);
        return "mausacchitiet";

    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("mauSac") MauSac mauSac) {
        mauSacService.update(UUID.fromString(id), mauSac);
        return "redirect:/mausac/hienthi";
    }
}
