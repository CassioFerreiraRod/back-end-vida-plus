package com.vida.plus.entity;

import com.vida.plus.enums.PerfilUsuario;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senhaHash;

    @Column
    private Boolean ativo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PerfilUsuario perfil;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = true)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "profissional_saude_id", nullable = true)
    private Profissional profissional;


}
