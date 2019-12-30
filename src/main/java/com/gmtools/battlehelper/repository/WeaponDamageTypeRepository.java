package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.WeaponDamageType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponDamageTypeRepository extends JpaRepository<WeaponDamageType,Integer> {

}
