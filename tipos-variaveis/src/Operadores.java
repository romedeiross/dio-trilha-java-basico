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

    }
    
}
