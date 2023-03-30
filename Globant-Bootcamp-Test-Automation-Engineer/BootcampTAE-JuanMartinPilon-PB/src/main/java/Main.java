import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

public class Main {

    public static int ultimos [] = {0,0,0,0,0};

    public static void change (int num) {
        ultimos [0] = ultimos [1];
        ultimos [1] = ultimos [2];
        ultimos [2] = ultimos [3];
        ultimos [3] = ultimos [4];
        ultimos [4] = num;

    }

    public static boolean sexo(char genero) {
        if (genero == 'F' || genero == 'M') {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }

    public static boolean sumapos() {
        int numeros[] = {0, 2, 2, 2, 4, 5, 6};
        if (numeros[1] % 2 == 0 && numeros[2] % 2 == 0 && numeros[3] % 2 == 0) {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }

    public static boolean soniguales() {
        String palabra1 = "Time";
        String palabra2 = "Timmme";
        if (palabra1 == palabra2) {
            System.out.println("TRUE");
            return true;
        } else {
            System.out.println("FALSE");
            return false;
        }
    }


    public static boolean encontrarpar() {
        int numeros[] = {3, 3, 3, 3, 3, 3, 3};
        boolean espar = false;
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("TRUE");
                return true;
            }
        }
        System.out.println("FALSE");
        return false;
    }

    public static boolean capicua() {
        int capi[] = {1, 2, 3, 2, 1};
            if (capi[0] == capi[4] && capi[1] == capi[3]) {
                System.out.println("TRUE");
                return true;
            } else {
                System.out.println("FALSE");
                return false;
            }
    }

    public static boolean ab () {
        int a = 6;
        int b = 2;
        if (a < b) {
            System.out.println("TRUE");
            return true;
        }
        else {
                System.out.println("FALSE");
                return false;
            }
    }

    public static boolean abdivi () {
        int a = 6;
        int b = 2;
        if (a * b == a / b) {
            System.out.println("TRUE");
            return true;
        }
        else {
            System.out.println("FALSE");
            return false;
        }
    }

    public static boolean compa2 (){
        int A[] = {3, 7, 5, 2, 15};
        int B[] = {10, 5, 7, 1, 4};
        int cont = 0;
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (A[i] == B[j]){
                    cont++;
                    if (cont >= 2) {
                        System.out.println("TRUE");
                        return true;
                    }
                }
            }
        }
        System.out.println("FALSE");
        return false;
    }

    public static String reves (String palabra){
        String invert = "";
        for(int i=palabra.length()-1;i>=0;i--){
            invert = invert + palabra.charAt(i);
                }
        return invert;
    }

    public static String vocales (String palabrinia){
        String equisde = "x";
        String vocalex= "";
        for(int i=0;i<palabrinia.length();i++){
            if (palabrinia.charAt(i) == 'a' || palabrinia.charAt(i) == 'e' || palabrinia.charAt(i) == 'i' || palabrinia.charAt(i) == 'o' || palabrinia.charAt(i) == 'u' || palabrinia.charAt(i) == 'A' || palabrinia.charAt(i) == 'E' || palabrinia.charAt(i) == 'I' || palabrinia.charAt(i) == 'O' || palabrinia.charAt(i) == 'U') {
                vocalex = vocalex + equisde;
            }
            else {
                vocalex = vocalex + palabrinia.charAt(i);
            }
        }
        return vocalex;
    }

    public static void mostrar () {
        for (int i=0;i<5;i++) {
            System.out.println(ultimos[i]);
        }
    }

    public static void main(String[] args) {
        char genero = 'T';
        while (true){
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch (op) {
                case 1: sexo(genero);
                    change(op);
                break;
                case 2: sumapos();
                    change(op);
                break;
                case 3: encontrarpar();
                    change(op);
                break;
                case 4: soniguales();
                    change(op);
                break;
                case 5: capicua();
                    change(op);
                break;
                case 6: ab();
                    change(op);
                break;
                case 7: abdivi();
                    change(op);
                break;
                case 8: compa2();
                    change(op);
                break;
                case 9: System.out.println(reves("Hola"));
                    change(op);
                break;
                case 10: System.out.println(vocales ("Amigo"));
                    change(op);
                break;
                case 11: change(op);
                    mostrar();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
        }

    }

}
