package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String []valores = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String []palo = {"Corazon","Pica","Diamante","Trebol"};
        Deck deck = new Deck();
        deck.crearDeck(palo, valores);
        deck.showMenu();

    }
}
