package FormatacaoNumeros;

import java.text.ParseException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static final PhoneFormat[] phoneFormats = PhoneFormat.values();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira uma sequência de números:");
        String digitsSequence = scanner.next();

        PhoneFormat phoneFormat = getValidPhoneFormat(digitsSequence);
        if (Objects.isNull(phoneFormat)) {
            System.out.printf("A sequência %s não é válida.\n", digitsSequence);
            return;
        } else if (phoneFormat.isFormatted(digitsSequence)) {
            System.out.println("Número já formatado.");
            System.out.printf("%s: %s\n", phoneFormat.getName(), digitsSequence);
            return;
        }

        try {
            System.out.printf("%s: %s\n", phoneFormat.getName(), phoneFormat.format(digitsSequence));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static PhoneFormat getValidPhoneFormat(String digitsSequence) {
        for (PhoneFormat p : phoneFormats) {
            if (p.hasNecessaryDigits(digitsSequence)) return p;
        }
        return null;
    }
}
