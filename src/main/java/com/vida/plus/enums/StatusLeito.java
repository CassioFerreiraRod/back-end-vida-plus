package com.vida.plus.enums;

public enum StatusLeito {
    DISPONIVEL("Leito disponível para ocupação"),
    OCUPADO("Leito atualmente ocupado por um paciente"),
    MANUTENCAO("Leito em manutenção e não disponível"),
    RESERVADO("Leito reservado para paciente, mas ainda não ocupado"),
    EM_OBSERVACAO("Leito sendo monitorado ou aguardando decisão médica");

    private final String descricao;

    StatusLeito(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
