package com.example.assignment.Controller;

import com.example.assignment.Model.HoaDon;
import com.example.assignment.Service.HoaDonService;
import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/hoadon")
public class HoaDonController {
    @Autowired
    HoaDonService hoaDonService;

    @GetMapping("/hienthi")
    public String HienThi(Model model) {
        List<HoaDon> lstHoaDon = hoaDonService.getAll();
        model.addAttribute("lstHoaDon", lstHoaDon);
        model.addAttribute("hoaDon", new HoaDon());
        return "hoadon";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("hoaDon") HoaDon hoaDon) {
        hoaDonService.add(hoaDon);
        return "redirect:/hoadon/hienthi";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        hoaDonService.delete(UUID.fromString(id));
        return "redirect:/hoadon/hienthi";
    }

    @GetMapping("/detail/{id}")
    public String ChiTiet(@PathVariable String id, Model model) {
        HoaDon hoadon = hoaDonService.detail(UUID.fromString(id));
        model.addAttribute("hoaDon", hoadon);
        return "hoadondetail";
    }

    @PostMapping("/update/{id}")
    public String Sua(@PathVariable String id, @ModelAttribute("hoaDon") HoaDon hoaDon) {
        hoaDonService.update(UUID.fromString(id), hoaDon);
        return "redirect:/hoadon/hienthi";
    }
}
