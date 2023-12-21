package com.example.myappjava.model;

public class Pessoa {

    //Contrutor Padrão
    //Atributos e Métodos de Acesso que são: Getters and Setters
    private String firstName;
    private String lastName;
    private String cursoDesejado;
    private String phoneContato;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getPhoneContato() {
        return phoneContato;
    }

    public void setPhoneContato(String phoneContato) {
        this.phoneContato = phoneContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", phoneContato='" + phoneContato + '\'' +
                '}';
    }

    public Pessoa(){


    }
}
