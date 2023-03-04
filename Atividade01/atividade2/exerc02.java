package atividade2;

import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
         System.out.println("Digite um numero para o tamanho do vetor?");
         int tamanho = Integer.parseInt(s.nextLine());
         int[] array=new int[tamanho];
         System.out.print(tamanho);

       // for(int c=0;c < n.length; c++){
           // System.out.println(" Na posicão " + c + " temos o valor " +n[c]);        }
    }
 
}
