package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.WeaponAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponAvailabilityRepository extends JpaRepository<WeaponAvailability,Integer> {
}
