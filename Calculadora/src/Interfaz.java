    import java.util.Scanner;

    public class Interfaz {
        public static void main(String args[]){

            Scanner leer = new Scanner(System.in);

            int opc;
            double num1, num2;
            Calculadora c;

            do {
                System.out.println("---------------------------------------");
                System.out.println("MENU DE LA CALCULADORA");
                System.out.println("1. SUMA (+)");
                System.out.println("2. RESTA (-)");
                System.out.println("3. MULTIPLICACION (*)");
                System.out.println("4. DIVICION (/)");
                System.out.println("5. RAIZ CUADRADA");
                System.out.println("6. POTENCIA (solo numeros enteros)");
                System.out.println("7. SALIR");
                System.out.println("---------------------------------------");
                opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el primer numero");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero");
                        num2 = leer.nextDouble();
                        System.out.println("---------------------------------------");
                        System.out.println("RESULTADO");
                        System.out.println(num1 + " + " + num2);
                        c = new Calculadora(num1, num2);
                        System.out.println("El resultado es: " + c.calcularSuma());
                        break;
                    case 2:
                        System.out.println("Ingrese el primer numero");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero");
                        num2 = leer.nextDouble();
                        System.out.println("---------------------------------------");
                        System.out.println("RESULTADO");
                        System.out.println(num1 + " - " + num2);
                        c = new Calculadora(num1, num2);
                        System.out.println("El resultado es: " + c.calcularResta());
                        break;
                    case 3:
                        System.out.println("Ingrese el primer numero");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero");
                        num2 = leer.nextDouble();
                        System.out.println("---------------------------------------");
                        System.out.println("RESULTADO");
                        System.out.println(num1 + " * " + num2);
                        c = new Calculadora(num1, num2);
                        System.out.println("El resultado es: " + c.calcularMultiplicacion());
                        break;
                    case 4:
                        System.out.println("Ingrese el primer numero");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero");
                        num2 = leer.nextDouble();
                        System.out.println("---------------------------------------");
                        System.out.println("RESULTADO");
                        System.out.println(num1 + " / " + num2);
                        c = new Calculadora(num1, num2);
                        System.out.println("El resultado es: " + c.calcularDivision());
                        break;
                    case 5:
                        System.out.println("Ingrese el numero");
                        num1 = leer.nextDouble();
                        System.out.println("---------------------------------------");
                        System.out.println("RESULTADO");
                        System.out.println("Raiz cuadrada de " + num1);
                        c = new Calculadora(num1, num2 = 0);
                        System.out.println("El resultado es: " + c.calcularRaiz());
                        break;
                    case 6:
                        System.out.println("Ingrese el numero");
                        num1 = leer.nextDouble();
                        System.out.println("Ingrese el valor de la potencia");
                        num2 = leer.nextDouble();
                        System.out.println("---------------------------------------");
                        System.out.println("RESULTADO");
                        System.out.println(num1 + " ^ " + num2);
                        c = new Calculadora(num1, num2);
                        System.out.println("El resultado es: " + c.calcularPotencia());
                        break;
                    case 7:
                        opc = 7;
                        break;
                    default:
                        System.out.println("Opcion no valida, intentelo de nuevo");
                }
            }while(opc != 7);
        }
    }
