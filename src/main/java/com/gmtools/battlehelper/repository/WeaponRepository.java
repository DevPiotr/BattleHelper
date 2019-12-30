package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon,Integer> {
}
