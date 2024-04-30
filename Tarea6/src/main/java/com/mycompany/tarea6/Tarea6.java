/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author misae
 */
public class Tarea6 {

    public static void main(String[] args) {
        ArrayList<Autos> auto = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Selecciona una opcion");
            System.out.println("1- Registrar Nuevo Auto");
            System.out.println("2- Buscar un Auto");
            System.out.println("3- Editar un Auto");
            System.out.println("0- Auto-Destruccion");
            opcion = sc.nextInt();
        switch(opcion){
            case 1: //registro de nuevos autos con validacion de datos 
                try{
                 System.out.println("Ingrese los datos de su Auto");
                  System.out.println("ID unico de su auto: ");
                  String id = sc.next();
                  System.out.println("La marca de su auto: ");
                  String marca = sc.next();
                   System.out.println("El modelo de su auto: ");
                  String modelo = sc.next();
                  System.out.println("El año de su auto: ");
                  int ano = sc.nextInt();
                  System.out.println("El tipo de auto: ");
                  String tipo = sc.next();
                  System.out.println("El chasis de su auto: ");
                  String chasis = sc.next();
                  System.out.println("Por ultimo, el color de su auto: ");
                  String color = sc.next();
                    //se agrega al array nuestro nuevo auto
                  auto.add(new Autos(id,marca,modelo,ano,tipo,chasis,color));
                  System.out.println("Su auto ha sido registrado existosamente!");
                  
                   }catch(Exception e){
                  System.out.println("El tipo de dato ingresado es incorrecto");
                   }
            break;
            case 2://busqueda de autos ya existentes en el array
                System.out.println("Ingrese el id del auto a buscar");
                String SID = sc.next();
                boolean encontrao = false;
                for (Autos banana : auto){
                    if(banana.getID().equals(SID)){
                        banana.mostrarInfo();
                        encontrao = true;
                    }
                }
                if(!encontrao){
                    System.out.println("El auto no existe en los registros.");
                }
            break;
            case 3://editar un auto ya existente en el array
                try{
                System.out.println("Ingrese el ID del auto que quiere editar");
                String IdEdicion = sc.next();
                boolean flag = false;
                for(Autos mango : auto){
                    if(mango.getID().equals(IdEdicion)){
                  System.out.println("Ingrese los nuevos datos de su Auto");
                  System.out.println("Nuevo ID unico de su auto: ");
                  String NEWid = sc.next();
                  System.out.println("La nueva marca de su auto: ");
                  String NEWmarca = sc.next();
                   System.out.println("El nuevo modelo de su auto: ");
                  String NEWmodelo = sc.next();
                  System.out.println("El nuevo año de su auto: ");
                  int NEWano = sc.nextInt();
                  System.out.println("El nuevo tipo de auto: ");
                  String NEWtipo = sc.next();
                  System.out.println("El nuevo chasis de su auto: ");
                  String NEWchasis = sc.next();
                  System.out.println("Por ultimo, el nuevo color de su auto: ");
                  String NEWcolor = sc.next();
                  mango.EditarAuto(NEWid, NEWmarca, NEWmodelo, NEWano, NEWtipo, NEWchasis, NEWcolor);
                  System.out.println("El auto se edito correctamente!");
                  flag = true;
                    }
                }
                if(!flag){
                  System.out.println("El auto no fue encontrado, debe registrar un auto primero para editarlo!");
                }
                }
                catch(Exception e){
                System.out.println("Dato incorrecto.");    
                }
            break;
            default: System.out.println("Esa no es una opcion, cabeza de alcornoque");
        }
        }
        while(opcion != 0);
        sc.close();
        }
        }