package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.WeaponClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponClassRepository extends JpaRepository<WeaponClass,Integer> {

}
