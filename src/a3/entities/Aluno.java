package a3.entities;

import java.util.Random;

public class Aluno extends Pessoa {

    Random aleatorio = new Random();

    private int id;
    private int matricula = 0;
    private double nota1;
    private double nota2;
    private String periodo;
    private int ano;
    private String sexo;
    private int contador = 1;
    
    public Aluno(){
        
    }

    public Aluno(int matricula, String nome, int idade, String periodo, String sexo) {
        this.matricula = matricula;
        super.setNome(nome);
        super.setIdade(idade);
        this.periodo = periodo;
        this.sexo = sexo;
        this.nota1 = aleatorio.nextDouble(4, 9);
        this.nota2 = aleatorio.nextDouble(4, 9);
        contador++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    

    public int getContador() {
        return contador;
    }


    
    
}
