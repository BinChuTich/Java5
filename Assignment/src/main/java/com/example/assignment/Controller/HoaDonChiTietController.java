package com.example.assignment.Controller;

import com.example.assignment.Model.HoaDonChiTiet;
import com.example.assignment.Model.IdHoaDonChiTiet;
import com.example.assignment.Service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/hoadonchitiet")
public class HoaDonChiTietController {

    @Autowired
    HoaDonChiTietService hoaDonChiTietService;

    @GetMapping("/hienthi")
    public String HienThi(Model model) {
        List<HoaDonChiTiet> list = hoaDonChiTietService.getALl();
        model.addAttribute("lst", list);
        model.addAttribute("hoaDonChiTiet", new HoaDonChiTiet());
        return "hoadonchitiet";
    }

    @PostMapping("/add")
    public String Them(@ModelAttribute("hoaDonChiTiet") HoaDonChiTiet hoaDonChiTiet) {
        hoaDonChiTietService.add(hoaDonChiTiet);
        return "redirect:/hoadonchitiet/hienthi";
    }

    @GetMapping("/delete/{id}")
    public String Xoa(@PathVariable String id) {
        hoaDonChiTietService.delete(UUID.fromString(id));
        return "redirect:/hoadonchitiet/hienthi";
    }
}
