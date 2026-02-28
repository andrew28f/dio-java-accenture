package FormatacaoNumeros;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public enum PhoneFormat {

    // National -> With Area Code
    // Local -> Without Area Code

    LANDLINELOCAL("Telefone sem DDD", 8, "####-####"),
    LANDLINENATIONAL("Telefone com DDD", 10, "(##)####-####"),
    MOBILELOCAL("Celular sem DDD", 9, "#####-####"),
    MOBILENATIONAL("Celular com DDD", 11, "(##)#####-####");

    private final String name;
    private final int numberOfDigits;
    private final String mask;

    PhoneFormat(String name, int numberOfDigits, String mask) {
        this.name = name;
        this.numberOfDigits = numberOfDigits;
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDigits() {
        return numberOfDigits;
    }

    public String getMask() {
        return mask;
    }

    public Boolean hasNecessaryDigits(String toCount) {
        return extractNumbers(toCount).length() == numberOfDigits;
    }

    public Boolean isFormatted(String string) {
        String toMaskFormat = string.replaceAll("\\d", "#");
        return toMaskFormat.equalsIgnoreCase(mask);
    }

    public String format(String toFormat) throws ParseException {
        String digitsToFormat = extractNumbers(toFormat);
        MaskFormatter maskFormatter = new MaskFormatter(mask);
        maskFormatter.setValueContainsLiteralCharacters(false);
        return maskFormatter.valueToString(digitsToFormat);
    }

    public String extractNumbers(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        var arrayString = string.toCharArray();
        for (char c : arrayString) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
