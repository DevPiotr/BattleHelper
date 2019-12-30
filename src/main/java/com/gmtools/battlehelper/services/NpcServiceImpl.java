package com.gmtools.battlehelper.services;

import com.gmtools.battlehelper.entity.Npc;
import com.gmtools.battlehelper.repository.NpcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class NpcServiceImpl implements NpcService {

    final NpcRepository npcRepository;

    public NpcServiceImpl(NpcRepository npcRepository) {
        this.npcRepository = npcRepository;
    }

    @Override
    public Set<Npc> getNpcFromDatabaseOrderByName() {
        return npcRepository.findAllByOrderByNameDesc();
    }
}
