package com.vida.plus.enums;

public enum PerfilUsuario {
    PACIENTE("Usuário que recebe atendimento médico"),
    PROFISSIONAL("Médico, enfermeiro ou outro profissional de saúde"),
    ADMINISTRADOR("Usuário com permissões para gerenciar o sistema e seus dados");

    private final String descricao;

    PerfilUsuario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
