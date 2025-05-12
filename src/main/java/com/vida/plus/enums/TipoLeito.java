package com.vida.plus.enums;

public enum TipoLeito {
    ENFERMARIA("Enfermaria"),
    UTI("UTI"),
    ISOLAMENTO("Isolamento"),
    CIRURGICO("Cirúrgico"),
    OBSERVACAO("Observação");

    private final String tipo;

    TipoLeito(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
