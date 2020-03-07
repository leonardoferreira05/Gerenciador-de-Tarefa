/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados.entidades;

/**
 *
 * @author leogo
 */
public class Tarefa {
    
    private Integer codtarefa;
    private String responsavelTarefa;
    private String descricaoTarefa;
    private String prioridadeTarefa;
    private String statusTarefa;
    private Projeto projeto;

    public Integer getCodtarefa() {
        return codtarefa;
    }

    public void setCodtarefa(Integer codtarefa) {
        this.codtarefa = codtarefa;
    }

    public String getResponsavelTarefa() {
        return responsavelTarefa;
    }

    public void setResponsavelTarefa(String responsavelTarefa) {
        this.responsavelTarefa = responsavelTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(String prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    public String getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(String statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
    
    
    
    
    
}
