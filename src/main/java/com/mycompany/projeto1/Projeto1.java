package com.mycompany.projeto1;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author rafazanella
 */
public class Projeto1 {

    public static void main(String[] args) {
        
        //Carros Chevette = new Carros("1234-gt43", "Chevette", "Chevrolet", 200000, 1973);
        //Carros Fusca = new Carros("12h4-12p8", "Fusca", "Volkswagen", 2000, 1977);
        //Carros Cayman = new Carros("leo1-reut", "718 Cayman GT4 RS", "Porsche", 1000, 2006)
              
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a quantidade de carros que deseja criar:");
            int N = sc.nextInt();
            
             Carros[] carros = new Carros[N];
            
        for(int i = 0; i < N; i++){
                
               System.out.printf("Digite as informações do %d° Carro (Placa, Modelo, Fabricante, Km e Ano de Fabricação): ", i + 1);
          
               String Placa = sc.nextLine();
               String Modelo = sc.nextLine();
               String Fabricante = sc.nextLine();
               sc.nextLine();
               int Km = sc.nextInt();
               int anoDeFabricacao = sc.nextInt();

                System.out.printf("Digite a quantidade de Km a serem aumentados: ");
                int novoKm = sc.nextInt();
              
              if(Km < 0 || anoDeFabricacao < 1950 || anoDeFabricacao > 2024){
                   return;
              }
                
                carros[i] = new Carros(Placa, Modelo, Fabricante, Km, anoDeFabricacao);
                
                carros[i].aumentar_km(novoKm);

                //System.out.printf("Dados do %d° Carro: ", i + 1);
                //carros[i].mostrar_dados();
        }    
        
               Arrays.sort(carros, (a, b) -> Integer.compare(a.getkm(), b.getkm()));
               
                for(int i = 0; i < N; i++){
                     System.out.printf("Carro %d:\n", i + 1);
                  carros[i].mostrar_dados();
                }

    }
}
