package com.gmtools.battlehelper.controller.weapon;

import com.gmtools.battlehelper.entity.Special;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weapon/special/")
public class WeaponSpecialController {

    @GetMapping("add")
    public String showFormToAddWeaponSpecial(Special special,
                                             Model model){
        model.addAttribute("weaponSpecial",special);
        return "add_forms/add_weapon_special";
    }
    @PostMapping("add")
    public String saveSpecialInDatabase(Model model){
        model.addAttribute("successText","Pomyślnie dodano uwagę");
        return "add_forms/add_weapon_special";
    }
}
