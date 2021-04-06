
package com.mycompany.calculadeira;

import java.util.Scanner;

public class Calculation {
    Double numA, numB;
    Double resultado;
    String symbol;
    Scanner ler = new Scanner(System.in);
    Scanner symb = new Scanner(System.in);
    
    void dialog(){
         
         System.out.println("QUAL SERIA A OPERAÇÃO?");
         symbol = symb.nextLine();
         
         if (symbol.equals("R")){
         System.out.println("DIGA-ME O PRIMEIRO NÚMERO");
         numA = ler.nextDouble();
             
             
         }
         else{System.out.println("DIGA-ME O PRIMEIRO NÚMERO");
         numA = ler.nextDouble();
         System.out.println("INFORME O SEGUNDO NÚMERO GRACINHA <3 :");
         numB = ler.nextDouble();
         }
         
             if (symbol.equals("R")) { raiz();}
             if (symbol.equals("+")) { sun();}
             if (symbol.equals("-")) { sub(); }
             if (symbol.equals("/")) { div(); }
             if (symbol.equals("*")) { mult(); } 
             if (symbol.equals("%")) { mult(); }
          
         System.out.println(resultado);
        
        System.out.println("Este é seu resultado!");
        symbol = symb.nextLine();
          
    
         }
    
      double sun(){
      return resultado = numA+numB; 
     }
    
      double sub(){
      return resultado = numA-numB; 
      }
      
      double div(){
      return resultado = numA/numB; 
      }
      
      double mult(){
      return resultado = numA*numB; 
      }
      
      double raiz(){
      return resultado = Math.sqrt(numA);
      }
     
      double porcent(){
      return resultado = (numA / 100)*numB;
      }

public static void main (String[] args){
   Calculation Calculation1 = new Calculation();
   Calculation1.dialog();
 
    
    
}
    
 
}  

