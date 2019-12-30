package com.gmtools.battlehelper.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "weapon")
@Data
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "weapon_class_id")
    private WeaponClass weaponClass;

    @Column(name="range")
    private int range;

    @Column(name="semi_auto_burst_rate_of_fire")
    private int semiAutoBurstRateOfFire;

    @Column(name="full_auto_burst_rate_of_fire")
    private int fullAutoBurstRateOfFire;

    @NotNull
    @Column(name="damage")
    private int damage;

    @ManyToOne
    @JoinColumn(name = "weapon_damage_type_id")
    private WeaponDamageType weaponDamageType;

    @NotNull
    @Column(name="penetration")
    private int penetration;

    @NotNull
    @Column(name="clip")
    private int clip;

    @NotNull
    @Column(name="reload")
    private int reload;

    @NotNull
    @Column(name="weight")
    private int weight;

    @ManyToOne
    @JoinColumn(name = "weapon_availability_id")
    private WeaponAvailability weaponAvailability;

    @ManyToMany
    @JoinTable(
            name = "weapon_special",
            joinColumns = @JoinColumn(name = "weapon_id"),
            inverseJoinColumns = @JoinColumn(name = "special_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"weapon_id","special_id"})
    )
    private Set<Special> specials;

}
