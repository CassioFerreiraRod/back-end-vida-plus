package com.vida.plus.enums;

public enum CategoriaProfissional {
    MEDICO("Médico"),
    ENFERMEIRO("Enfermeiro"),
    TECNICO_ENFERMAGEM("Técnico de Enfermagem"),
    PSICOLOGO("Psicologo"),
    FISIOTERAPEUTA("Fisioterapeuta"),
    NUTRICIONISTA("Nutricionista"),
    ADMINISTRATIVO("Administrativo");

    private final String descricao;

    CategoriaProfissional(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
