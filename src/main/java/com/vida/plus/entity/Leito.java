package com.vida.plus.entity;

import com.vida.plus.enums.StatusLeito;
import com.vida.plus.enums.TipoLeito;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "leito")
public class Leito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoLeito tipoLeito;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusLeito statusLeito;
}
