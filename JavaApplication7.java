
package javaapplication7;

public class JavaApplication7 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero de rango: ");
        int primerNumero = scanner.nextInt();
        System.out.print("ingrese en segundo numero: ");
        int segundoNumero = scanner.nextInt();
        
        System.out.println("los numeros impares en el rango de " + primerNumero + " a " + segundoNumero);
        for (int i = primerNumero; i <= segundoNumero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
            }
        }
    
    

