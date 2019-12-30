package com.gmtools.battlehelper.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "npc")
public class Npc {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "npc_type_id")
    private NpcType npcType;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "hp")
    private int hp;

    //region armor
    @Column(name = "head_armor")
    private int headArmor;

    @Column(name = "right_arm_armor")
    private int rightArmArmor;

    @Column(name = "left_arm_armor")
    private int leftArmArmor;

    @Column(name = "body_armor")
    private int bodyArmor;

    @Column(name = "left_leg_armor")
    private int leftLegArmor;

    @Column(name = "right_leg_armor")
    private int rightLegArmor;

    //endregion

    //region characteristics
    @NotNull
    @Column(name = "weapon_skill")
    private int weaponSkill;

    @NotNull
    @Column(name = "ballistic_skill")
    private int ballisticSkill;

    @NotNull
    @Column(name = "strength")
    private int strength;

    @NotNull
    @Column(name = "toughness")
    private int toughness;

    @NotNull
    @Column(name = "agility")
    private int agility;

    @NotNull
    @Column(name = "intelligence")
    private int intelligence;

    @NotNull
    @Column(name = "perception")
    private int perception;

    @NotNull
    @Column(name = "willpower")
    private int willpower;

    @NotNull
    @Column(name = "fellowship")
    private int fellowship;

    @Column(name = "influence")
    private int influence;

    //endregion

    @NotNull
    @Column(name = "threat")
    private int threat;

    @ManyToMany
    @JoinTable(
            name = "npc_weapon",
            joinColumns = @JoinColumn(name = "npc_id"),
            inverseJoinColumns = @JoinColumn(name = "weapon_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"npc_id","weapon_id"})
    )
    private Set<Weapon> weapons;

    @ManyToMany
    @JoinTable(
            name = "npc_ability",
            joinColumns = @JoinColumn(name = "npc_id"),
            inverseJoinColumns = @JoinColumn(name = "ability_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"npc_id","ability_id"})
    )
    private Set<Ability> abilities;

    @ManyToMany
    @JoinTable(
            name = "npc_gear",
            joinColumns = @JoinColumn(name = "npc_id"),
            inverseJoinColumns = @JoinColumn(name = "gear_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"npc_id","gear_id"})
    )
    private Set<Gear> gears;

    @ManyToMany
    @JoinTable(
            name = "npc_talent",
            joinColumns = @JoinColumn(name = "npc_id"),
            inverseJoinColumns = @JoinColumn(name = "talent_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"npc_id","talent_id"})
    )
    private Set<Talent> talents;

    @ManyToMany
    @JoinTable(
            name = "npc_trait",
            joinColumns = @JoinColumn(name = "npc_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"npc_id","trait_id"})
    )
    private Set<Trait> traits;
}
