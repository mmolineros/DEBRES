package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader numeros=new BufferedReader(new InputStreamReader(System.in));

        int arreglo[],num,i,j,aux;

        String cant;

        cant= JOptionPane.showInputDialog(null, "Ingrese cantidas de numeros del arreglo");

        num=Integer.parseInt(cant);

        arreglo=new int [num];


        for (i=0;i<num;i++){

            System.out.print("Numero ["+i+"] ");

            arreglo[i]= Integer.parseInt(numeros.readLine());

        }


        for(i=0;i<num-1;i++)

            for(j=i+1;j<num;j++){

                if(arreglo[i]>arreglo[j]){

                    aux=arreglo[i];

                    arreglo[i]=arreglo[j];

                    arreglo[j]=aux;

                }

            }



        System.out.println ("Numeros ordenados en forma ascendente:" );

        for (i=0;i<num;i++){

            System.out.println("Numero["+i+"]" + arreglo[i]);


        }

    }//fin del main

}//fin de la clase main

