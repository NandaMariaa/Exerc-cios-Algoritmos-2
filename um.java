import java.util.Scanner;

public class um {

public static void main(String[] args) throws Exception {

    //Programa que lê e calcula a média de 5 notas de um aluno
       
        double[] nota = new double[5];
        double soma = 0.0, media;
        int i ;
        int TAM = 5;
   
        Scanner leitor = new Scanner(System.in);
   
        System.out.println( "Digite os valores das cinco notas:");
            for (i = 0 ; i < TAM ; i ++ ){
                    nota [i] = leitor.nextDouble();
                    soma = soma + nota [i];
                }
                    media = soma/5 ;
                    System.out.println("Média das notas: " + media ) ;
           
            }

}
