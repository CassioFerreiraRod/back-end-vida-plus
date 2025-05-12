package com.vida.plus.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@Entity
@Table(name = "prescricao")
public class Prescricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "profissional_saude_id", nullable = false)
    private Profissional profissional;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime dataEmissao;

    @Column(nullable = false)
    private String medicamento;

    @Column(nullable = false)
    private String dosagem;
}
