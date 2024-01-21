import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{

            System.out.println("Digite o contador 1");
            int interacao1 = sc.nextInt();
            System.out.println("Digite o contador 2");
            int interacao2 = sc.nextInt();

            contar(interacao1,interacao2);

        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());

        }catch (InputMismatchException e){
            System.out.println("Erro: insira os valores de maneira numérica");
        }
        sc.close();
    }

    static void contar(int parametro1 , int parametro2) throws ParametrosInvalidosException{
        int contador = parametro2 - parametro1;
        System.out.println(contador);
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException("Erro: o parâmetro 1 tem que ser menor que o parâmetro 2");
        }else{
            for (int i = 0; i < contador; i++) {
                System.out.println("Contador esta em: " + (i + parametro1));
            }
        }
    }
}