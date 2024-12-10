package ru.ifmo.se.pokemon;
import pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Flygon p1 = new Flygon("Флуппер", 3);
        Quagsire p2 = new Quagsire("Куга", 2);
        Trapinch p3 = new Trapinch("СпрингТрап", 1);
        Vibrava p4 = new Vibrava("ВиброБаба", 2);
        Wooper p5 = new Wooper("Вопер", 1);
        Zapdos p6 = new Zapdos("ЗавХос", 3);
        b.addAlly(p2);
        b.addFoe(p4);
        b.addAlly(p1);
        b.addFoe(p3);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}