package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;
import entities.PessoasFisicas;
import entities.PessoasJuridicas;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoas> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #"+ i +" data: ");
            System.out.print("Individual or Company (i/c)? " );
            char ch = sc.next().charAt(0); 
            System.out.print("Name: ");  
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Health Expenditures: ");
                double gastosSaude = sc.nextDouble(); 
                list.add(new PessoasFisicas(nome, rendaAnual, gastosSaude));
            }

            else if(ch == 'c'){
                System.out.print("Number of employeer: ");
                int numFuncionarios = sc.nextInt();
                list.add(new PessoasJuridicas(nome, rendaAnual, numFuncionarios));

                }
        
            }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Pessoas pessoas : list) {
             System.out.print(pessoas.getNome()+ ": " +String.format("%.2f", pessoas.impostos(),"\n"));
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ ");
        double soma = 0.0;
        for(Pessoas pessoas : list){
            soma += pessoas.impostos();
            System.out.println(String.format("%.2f", soma, "\n"));
        }
       
        
     sc.close();
    }
   
   
}
