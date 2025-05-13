package com.vida.plus.entity;

import com.vida.plus.enums.TipoInstituicao;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class InstituicaoSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cnpj;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoInstituicao tipoInstuicao;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String endereco;
}
