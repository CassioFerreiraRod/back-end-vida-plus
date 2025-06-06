package com.vida.plus.entity;

import com.vida.plus.enums.CategoriaProfissional;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "profissional_saude")
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String crm;

    @Column(nullable = false)
    private String especialidade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoriaProfissional tipo;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

}
