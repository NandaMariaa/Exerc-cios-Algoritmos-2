import java.util.Scanner;

public class tres {
    
public static void main (System [] args){

    //Fazer um programa com 2 vetores com 5 valores reais cada, previamente definidos,
    //em que um terceiro vetor é criado a partir da média entre osdois primeiros vetores 
    //(média entre a posição 0 do primeiro com a posição 0 do segundo; média entre a posição 1 do primeiro e a posição 1 do segundo, e assim sucessivamente). 
    //A seguir, fazer a média dos valores contidos no terceiro vetor. 
    //Apresentar ao usuário os valores contidos no terceiro vetor e sua média.

    int vetor1[] = {33,21,45,13,3};
    int vetor2[] = {8,4,16,28,12};
    float vetorMedia[] = {0,0,0,0,0}, soma = 0, media;
    int i ;

        for (i = 0 ; i < 5 ; i ++ ){
            vetorMedia[i] = vetor1[i] + vetor2[i]; // Os índices do Vetor 3 serão iguais ás somas dos indices do 1 com o 2.
            soma = soma + vetorMedia[i];
        }

    media = soma/5;

        for (i = 0 ; i < 5 ; i ++ ){
            System.out.println("A posição " + i + " do terceiro vetor, contém o valor " +
            vetorMedia[i]);
        }

    System.out.println("A média dos valores do terceiro vetor é: " + media ) ;

  }
    
}
