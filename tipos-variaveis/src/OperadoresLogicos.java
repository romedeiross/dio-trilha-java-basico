public class OperadoresLogicos {
/*operadores lógicos nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões */

public static void main(String[] args) {
    boolean condicao1 = true;
    boolean condicao2 = false;

    // operador && (and) (E) o resultado será verdadeiro caso todas as comparações sejam  verdadeiras.

        if (condicao1 && condicao2) {
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }
    
    
    // operador || (Or) (OU) o resultado será verdadeiro bastando apenas uma das comparações ser verdadeira.
        if (condicao1 || condicao2) {
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }

    
    // operador ! (NÂO) é utilizado para inverter o resultado de uma determinada condição. Ou seja, se a condição for verdadeira esta torna-se falsa, e se a condição for falsa ela torna-se verdadeira.
        if (!condicao1 || condicao2) {
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }


    
}

}
