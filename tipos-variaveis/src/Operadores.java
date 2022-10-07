public class Operadores {
    public static void main(String[] args) {
     // Operadores de atribuição "="
    int a = 5;
    int b = 2;
     
    //Operadores Aritméticos    
     int soma = a + b; // soma "+"
     int subtracao = a - b; // subtração "-"
     double multiplicacao = a * b; //multiplicação "*"    
     double divisao = a / b ; //Divisão "/"
     int modulo = a % b; //Resto da divisão

     // Operador concatenização "+" o simbolo de + quando utilizando em entre duas strings não soma as duas, ele concatena, ou seja ele junta as duas strings, a partir do momento que é detectado um caracter ele deixa de efetuar a operação de soma.
     String nome, sobrenome;
     nome = "Pedro";
     sobrenome = "Souza";  
     System.out.println(soma);
    System.out.println(subtracao);
    System.out.println(multiplicacao);
    System.out.println(divisao);  
    System.out.println(modulo);
    System.out.println(nome + " " + sobrenome);  

     /*Operadores unários, são aplicados juntamente com um  outro  operador aritmético, realizam coisas básicas como "incrementar", "Decrementar", "inverter valores nméricos ou booleanos".*/

     //(+) operadores unários valor positivo 
     
     //(-) operadores unários valor negativo
     System.out.println( - a); 

     //(++) Operador unário de incremento
     System.out.println(a++); 

     //(--) Operador unário de decremento
     System.out.println(a--);

     //(!) Operador unário de negação
     boolean variavel = true;
        System.out.println(!variavel);

    }
    
}
