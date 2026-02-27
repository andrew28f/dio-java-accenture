package Calculadora;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número da operação a ser feita:\n" +
            "1 - Soma\n" + "2 - Subtração"
        );
        int selectedOperation = scanner.nextInt();
        while (selectedOperation < 1 || selectedOperation > 2) {
            System.out.println("Escolha uma opção válida:\n" +
                    "1 - Soma\n" + "2 - Subtração"
            );
            selectedOperation = scanner.nextInt();
        }
        Operation operation = Operation.values()[selectedOperation - 1];

        System.out.println("Informe os números que serão usados para o cálculo separados por vírgulas (ex.: 1,2,3,4):");
        var numbers = scanner.next();
        long[] numberArray = Arrays.stream(numbers.split(",")).mapToLong(Long::parseLong).toArray();

        System.out.printf("Operação realizada:\n %s = %d",
                numbers.replaceAll(",", " " + operation.getSymbol() + " "),
                operation.getOperationCallback().execute(numberArray)
        );
    }

}
