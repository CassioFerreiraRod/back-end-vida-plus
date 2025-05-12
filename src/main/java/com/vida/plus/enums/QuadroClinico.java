package com.vida.plus.enums;

public enum QuadroClinico {

    DOENCA_CRONICA("Doença crônica"),
    CIRURGIA_PREVIA("Cirurgia Prévia"),
    ALERGIA("Alergia"),
    HABITO("Hábito"),
    HISTORICO_FAMILIAR("Histórico familiar"),
    NAO_ESPECIFICADO("Não espeficicado");

    private final String descricao;

    QuadroClinico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
