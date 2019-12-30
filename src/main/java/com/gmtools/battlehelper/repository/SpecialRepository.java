package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Special;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialRepository extends JpaRepository<Special,Integer> {
}
