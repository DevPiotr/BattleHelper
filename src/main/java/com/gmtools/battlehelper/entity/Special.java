package com.gmtools.battlehelper.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "special")
@Data
public class Special {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "specials",fetch = FetchType.LAZY)
    private Set<Weapon> weaponSet;
}
