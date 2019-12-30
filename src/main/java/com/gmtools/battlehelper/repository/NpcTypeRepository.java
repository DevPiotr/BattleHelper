package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Npc;
import com.gmtools.battlehelper.entity.NpcType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NpcTypeRepository extends JpaRepository<NpcType,Integer> {
}
