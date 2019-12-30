package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Talent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalentRepository extends JpaRepository<Talent,Integer> {
}
