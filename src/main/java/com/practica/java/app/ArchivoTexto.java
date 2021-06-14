package com.practica.java.app;

import com.practica.java.util.files.FileText;
import com.practica.java.util.files.I_File;
import java.util.ArrayList;
import java.util.List;

/**
 * Ejemplo usando la interfaz I_File
 * con la implementaciòn de ArchivoTexto
 * @author brian
 */
public class ArchivoTexto {
    public static void main(String[] args) {
        String ruta="archivos/info.txt";
        I_File fText=new FileText(ruta);
        fText.setText("Curso de Java!\n");
        fText.append("Primavera. \n");
        fText.append("Verano. \n");
        fText.append("Otoño. \n");
        fText.append("Invierno. \n");
        fText.append("Lunes. \n");
        fText.append("Lunes. \n");
        fText.append("Martes. \n");
        fText.append("Miercoles. \n");
        fText.append("Jueves. \n");
        fText.append("Viernes. \n");
        fText.append("Sabado. \n");
        fText.append("Domingo. \n");
        fText.append("Lunes. \n");
        
        System.out.println("*************print*********");
        fText.print();
        System.out.println("*************getAll*********");
        fText.getAll().forEach(System.out::println);
        System.out.println("************getFilter*******************");
        fText.getByFilter("ma").forEach(System.out::println);
        System.out.println("***************getSortedLines****************");
        fText.getSortedLines().forEach(System.out::println);
        System.out.println("***************getReversedLines****************");
        fText.getReversedSortedLines().forEach(System.out::println);
        System.out.println("**************getLinkedHashSet*****************");
        fText.getLinkedHashSet().forEach(System.out::println);
        System.out.println("**************getTreeSet***********************");
        fText.getTreeSet().forEach(System.out::println);
        System.out.println("**************remove**************************");
        fText.remove("Lunes. ");
        fText.getStream().forEach(System.out::println);
        System.out.println("*************addlines************************");
        List<String> lista = new ArrayList();
        lista.add("enero");
        lista.add("febrero");
        lista.add("marzo");
        fText.addlines(lista);
        fText.getAll().forEach(System.out::println);
    }
}
