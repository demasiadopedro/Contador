import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametro2 = terminal.nextInt();
        
        
        
        
        try {
            contar(parametro1, parametro2);
        } catch (ParametroInvalidoException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar (int parametro1, int parametro2)throws ParametroInvalidoException {

        if(parametro1> parametro2){
            throw new ParametroInvalidoException(
                "o parametro 2 deve ser maior que o parametro 1"
                );
        }

        int contagem = parametro2 - parametro1;

        for (int i= 1; i <= contagem; i++){
            System.out.println("imprimindo: "+ i);
        }
    }

    public static class ParametroInvalidoException extends Exception {
        public ParametroInvalidoException(String msg) {
            super(msg);
        }
    }

}
