//double = float
//passo 1 importar  java.util.Scanner;
//passo 2 definir o scanner:  Scanner scanner = new Scanner(System.in);
//passo 3 pedir os dois numeros do calculo
//botar em baixo de cada um scanner.nextDouble(); para escanear o input
//passo 4 usar scanner.next().charAt(0); para checar string do do operador
//passo 5 fechar o escaner- .close()
//passo 6 criar uma variavel que vai guardar o resultado
//fazer switch para as operações + - * e /
//default ser erro
//printar resultado



import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
       double num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero");
       double num2 = scanner.nextDouble();
        System.out.println("qual sera a operação + ,- ,/ ,*");
        char ope = scanner.next().charAt(0);
        scanner.close();
        double resul = 0;

        switch(ope){
            case '+' :
                   resul = num1 + num2;
                break;
            case '-':
                resul= num1 - num2;
                break;
            case '*':
                resul = num1 * num2;
                break;
            case '/':
                resul = num1 / num2;
            break;
            default: System.out.println("houve um erro");

        }

        System.out.println(num1+""+ope+""+num2+"="+resul);
    }
}