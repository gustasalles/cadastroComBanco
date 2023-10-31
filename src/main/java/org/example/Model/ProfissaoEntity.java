package org.example.Model;

public class ProfissaoEntity {

    private int id;
    private String cargo;
    private Double salario;
    private Double imposto;


    public ProfissaoEntity(int id, String cargo, Double salario, Double imposto) {
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
        this.imposto = imposto;
    }

    public ProfissaoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

}
