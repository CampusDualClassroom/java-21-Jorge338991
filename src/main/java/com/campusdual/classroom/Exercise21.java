package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> miColeccion = new HashSet<>();
        String arrayString[] = {
                "ELEMENT KPRBC",
                "ELEMENT KPRBC",
                "ELEMENT YPBTM",
                "ELEMENT AADXU",
                "ELEMENT RXCGJ",
                "ELEMENT WYMVD",
                "ELEMENT WFGEJ",
                "ELEMENT TYGBS",
                "ELEMENT MAPTK",
                "ELEMENT GJXVE",
                "ELEMENT BAFGL"
        };
        for (String elemento : arrayString) {
            miColeccion.add(elemento);
        }
        return miColeccion;
    }

    public static Set<String> createTreeSet() {
        Set<String> miColeccion2 = new TreeSet<>();
        String arrayString[] = {
                "ELEMENT KPRBC",
                "ELEMENT KPRBC",
                "ELEMENT YPBTM",
                "ELEMENT AADXU",
                "ELEMENT RXCGJ",
                "ELEMENT WYMVD",
                "ELEMENT WFGEJ",
                "ELEMENT TYGBS",
                "ELEMENT MAPTK",
                "ELEMENT GJXVE",
                "ELEMENT BAFGL"
        };
        for (String elemento : arrayString) {
            miColeccion2.add(elemento);
        }
        return miColeccion2;
    }

    private static void printSet(Set<String> customSet) {
        System.out.println(customSet);
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