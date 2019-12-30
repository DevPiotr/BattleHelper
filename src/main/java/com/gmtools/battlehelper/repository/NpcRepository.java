package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Npc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface NpcRepository extends JpaRepository<Npc,Integer> {
    Set<Npc> findAllByOrderByNameDesc();
}
