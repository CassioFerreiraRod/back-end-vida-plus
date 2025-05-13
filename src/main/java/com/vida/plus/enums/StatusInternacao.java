package com.vida.plus.enums;

public enum StatusInternacao {
    AGUARDANDO("Internação solicitada, aguardando confirmação ou liberação."),
    INTERNADO("Paciente atualmente internado."),
    ALTA("Paciente recebeu alta e pode deixar o hospital."),
    TRANSFERIDO("Paciente transferido para outro hospital ou unidade."),
    EM_OBSERVACAO("Paciente em observação, aguardando avaliação médica.");

    private final String descricao;

    StatusInternacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
