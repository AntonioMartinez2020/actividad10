package com.company;
import java.security.spec.ECField;
import java.util.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Carta> cartas;

    public void crearDeck(String[]palo,String[]valores){
        cartas = new ArrayList<>();
        for ( int i = 0 ; i < palo.length; i ++){
            for (int j = 0; j < valores.length; j ++){
                Carta carta = new Carta();
                if (palo[i].equals("Corazon") || palo[i].equals("Diamante") ){
                    carta.color = "Rojo";
                } else
                    carta.color = "Negro";
                carta.palo = palo[i];
                carta.valor = valores[j];
                cartas.add(carta);
            }
        }
        System.out.println("Tamaño de la baraja:" + cartas.size());

    }

    public void mezclar() {
        try {
            Collections.shuffle(cartas);
            System.out.println("Se mezclo");
        }catch (Exception e){
            System.out.println("Se quedo sin cartas");
        }
    }
    public void head(){
        try {
            Carta carta = cartas.get(0);
            System.out.println("Palo : " + carta.palo);
            System.out.println("Color : " + carta.color);
            System.out.println("Valor : " + carta.valor);
            cartas.remove(0);
        } catch (Exception e){
            System.out.println("Se quedo sin cartas");
        }
    }
    public void pick(){
        try{
            Carta carta = cartas.get(51);
            System.out.println("Palo : " + carta.palo);
            System.out.println("Color : " + carta.color);
            System.out.println("Valor : " + carta.valor);
            cartas.remove(51);
            System.out.println("Quedan :" + cartas.size());
        } catch (Exception e){
            System.out.println("Se quedo sin cartas");
        }
    }
    public void hand(){
        try{
            for(int i = 2; i < 7; i++){
                Carta carta = cartas.get(i);
                System.out.println("Palo : " + carta.palo);
                System.out.println("Color : " + carta.color);
                System.out.println("Valor : " + carta.valor);
                cartas.remove(i);
            }
        System.out.println("Quedan :" + cartas.size());
        } catch (Exception e){
            System.out.println("Se quedo sin cartas");
        }
    }
    public void  showMenu(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a Poker!\nSelecciona una opción:");
            System.out.println("1.Mezclar\n2.Sacar una carta");
            System.out.println("3.Carta al azar\n4.Genera un mazo de 5\n0.Salir");
            int opcionSeleccionada = sc.nextInt();
            switch (opcionSeleccionada) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    mezclar();
                    break;
                case 2:
                    head();
                    break;
                case 3:
                    pick();
                    break;
                case 4:
                    hand();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}
