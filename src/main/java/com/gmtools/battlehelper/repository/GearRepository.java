package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Gear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GearRepository extends JpaRepository<Gear,Integer> {
}
