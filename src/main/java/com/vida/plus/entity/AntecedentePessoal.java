package com.vida.plus.entity;

import com.vida.plus.enums.QuadroClinico;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "antecedentes_pessoais")
public class AntecedentePessoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuadroClinico quadroClinico;

    @Column(nullable = true)
    private String complementoQuadroClinico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;
}
