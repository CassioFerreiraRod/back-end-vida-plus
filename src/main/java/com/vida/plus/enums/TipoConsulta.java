package com.vida.plus.enums;

public enum TipoConsulta {
    PRESENCIAL("Presencial"),
    TELEMEDICINA("Telemedicina");

    private final String descricao;

    TipoConsulta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
