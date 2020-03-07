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
public class Projeto {
    
    private Integer idProjeto;
    private String tituloProjeto;
    private String prioridade;
    private Integer statusProjeto;

    public Integer getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Integer idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getTituloProjeto() {
        return tituloProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        this.tituloProjeto = tituloProjeto;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Integer getStatusProjeto() {
        return statusProjeto;
    }

    public void setStatusProjeto(Integer statusProjeto) {
        this.statusProjeto = statusProjeto;
    }

   
    
    
}
