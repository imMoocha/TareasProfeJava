/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6;

/**
 *
 * @author misae
 */
public class Autos {
    //definimos las variables a utilizar
    String id;
    String marca;
    String modelo;
    int ano;
    String tipo;
    String chasis;
    String color;
    //colocamos los atributos de nuestra clase
    public Autos(String id, String marca, String modelo, int ano,String tipo, String chasis, String color){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.chasis = chasis;
        this.color = color;
    }
    //agregamos metodos a nuestra clase
    public void mostrarInfo(){
        System.out.println("El auto con el id "+id+" es de la marca "+marca+" modelo "+modelo+" del año "+ano+" es un "
                +tipo+" color "+color+" y sus chapa es "+chasis);
    }
    public String getID(){
        return id;
    }
    public void EditarAuto(String id, String marca, String modelo, int ano,String tipo, String chasis, String color){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.chasis = chasis;
        this.color = color;
    }
}
