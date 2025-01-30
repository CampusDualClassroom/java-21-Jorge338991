package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> miColeccion = new HashSet<>();

        miColeccion.add("ELEMENT KPRBC");
        miColeccion.add("ELEMENT YPBTM");
        miColeccion.add("ELEMENT AADXU");
        miColeccion.add("ELEMENT RXCGJ");
        miColeccion.add("ELEMENT WYMVD");
        miColeccion.add("ELEMENT WFGEJ");
        miColeccion.add("ELEMENT TYGBS");
        miColeccion.add("ELEMENT MAPTK");
        miColeccion.add("ELEMENT GJXVE");
        miColeccion.add("ELEMENT BAFGL");
        
        return miColeccion;
    }

    public static Set<String> createTreeSet() {
        Set<String> miColeccion2 = new TreeSet<>();

        miColeccion2.add("ELEMENT KPRBC");
        miColeccion2.add("ELEMENT YPBTM");
        miColeccion2.add("ELEMENT AADXU");
        miColeccion2.add("ELEMENT RXCGJ");
        miColeccion2.add("ELEMENT WYMVD");
        miColeccion2.add("ELEMENT WFGEJ");
        miColeccion2.add("ELEMENT TYGBS");
        miColeccion2.add("ELEMENT MAPTK");
        miColeccion2.add("ELEMENT GJXVE");
        miColeccion2.add("ELEMENT BAFGL");

        return miColeccion2;
    }

    private static void printSet(Set<String> customSet) {
        for(String elemento : customSet){
            System.out.println(elemento.toString());
        }
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set hashSet = createHashSet();
        Set treeSet =   createTreeSet();
        addElementToSet(hashSet,"ELEMENT AAA");
        addElementToSet(treeSet,"ELEMENT AAA");
        printSet(hashSet);
        printSet(treeSet);
    }

}