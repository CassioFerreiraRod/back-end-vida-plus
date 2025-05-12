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
@Table(name = "internacao")
public class Internacao {

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

    @ManyToOne
    @JoinColumn(name = "leito_id", nullable = false)
    private Leito leito;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime dataEntrada;

    @Column(nullable = true)
    @CreationTimestamp
    private LocalDateTime dataSaida;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusInternacao statusInternacao;
}
