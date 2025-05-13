package com.vida.plus.enums;

public enum TipoInstituicao {

    HOSPITAL("Hospital"),
    CLINICA("Clínica"),
    POSTO_SAUDE("Posto de Saúde"),
    LABORATORIO("Laboratório"),
    AMBULATORIO("Ambulatório");

    private final String descricao;

    TipoInstituicao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
