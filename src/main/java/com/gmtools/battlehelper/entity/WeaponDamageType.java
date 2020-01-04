package com.gmtools.battlehelper.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "weapon_damage_type")
@Data
public class WeaponDamageType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "long_name")
    private String longName;

    @OneToMany(
            mappedBy = "weaponDamageType",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Weapon> weaponSet;
}
