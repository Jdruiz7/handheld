package com.example.handheld.modelos;

public class RolloGalvaRevisionModelo {
    String id_revision;
    String estado;

    public RolloGalvaRevisionModelo() {
    }

    public RolloGalvaRevisionModelo(String id_revision, String estado) {
        this.id_revision = id_revision;
        this.estado = estado;
    }

    public String getId_revision() {
        return id_revision;
    }

    public void setId_revision(String id_revision) {
        this.id_revision = id_revision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
