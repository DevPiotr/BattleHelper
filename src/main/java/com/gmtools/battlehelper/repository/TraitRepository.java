package com.gmtools.battlehelper.repository;

import com.gmtools.battlehelper.entity.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraitRepository extends JpaRepository<Trait,Integer> {
}
