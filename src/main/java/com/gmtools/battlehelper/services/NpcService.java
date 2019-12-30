package com.gmtools.battlehelper.services;

import com.gmtools.battlehelper.entity.Npc;

import java.util.Set;

public interface NpcService {

    Set<Npc> getNpcFromDatabaseOrderByName();
}
