import java.util.Scanner;

public class dois {
public static void main(String[] args) throws Exception {

    //Vamos fazer um programa que leia 5 notas de alunos, mostre as 5 notas, calcule e mostre a média.

    double[] nota = new double[5];
    double soma = 0.0, media;
    int i ;
    int TAM = 5;

        Scanner leitor = new Scanner(System.in);
        System.out.println( "Digite os valores das cinco notas:" ) ;
            for (i = 0 ; i < TAM ; i ++ ){
                nota [i]= leitor.nextDouble();
                soma = soma + nota [i];
            }

            for (i = 0 ; i < TAM ; i ++ ){
                System.out.println(nota[i]);
            }

        media = soma/5 ;
        System.out.println("Média das notas: " + media ) ;

}

}
