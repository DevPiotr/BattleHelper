package com.gmtools.battlehelper.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
@Table(name = "npc_type")
public class NpcType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @OneToMany(
            mappedBy = "npcType",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Npc> npcSet;
}
