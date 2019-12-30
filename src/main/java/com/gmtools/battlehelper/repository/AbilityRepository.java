package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends JpaRepository<Ability,Integer> {
}
