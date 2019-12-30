package com.gmtools.battlehelper.controller;

import com.gmtools.battlehelper.services.NpcServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("npc/")
public class NpcController {

    final NpcServiceImpl npcService;

    public NpcController(NpcServiceImpl npcService) {
        this.npcService = npcService;
    }

    @GetMapping("show")
    public String showNPCList(Model model){

        model.addAttribute("npcSet",npcService.getNpcFromDatabaseOrderByName());

        return "npc_show";
    }
}
