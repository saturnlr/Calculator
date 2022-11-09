package calc;

class RomanResult {

    RomanResult() {
    }

    String getRomanValue(String value) {
        String romanValue = null;
        switch (value) {
            case "1":
                romanValue = "I";
                break;
            case "2":
                romanValue = "II";
                break;
            case "3":
                romanValue = "III";
                break;
            case "4":
                romanValue = "IV";
                break;
            case "5":
                romanValue = "V";
                break;
            case "6":
                romanValue = "VI";
                break;
            case "7":
                romanValue = "VII";
                break;
            case "8":
                romanValue = "VIII";
                break;
            case "9":
                romanValue = "IX";
                break;
            case "10":
                romanValue = "X";
                break;
            case "20":
                romanValue = "XX";
                break;
            case "30":
                romanValue = "XXX";
                break;
            case "40":
                romanValue = "XL";
                break;
            case "50":
                romanValue = "L";
                break;
            case "60":
                romanValue = "LX";
                break;
            case "70":
                romanValue = "LXX";
                break;
            case "80":
                romanValue = "LXXX";
                break;
            case "90":
                romanValue = "XC";
                break;
            case "100":
                romanValue = "C";
                break;
        }
        return romanValue;
    }

    String getRomanResult(int result) {
        if (result <= 0) {
            throw new ArithmeticException("Incorrect result!!! Roman number less I!!!");
        }
        String roman = "";
        String digitFirst = result / 10 + "0", digitSecond = result % 10 + "";
        RomanResult firstRomanDigit = new RomanResult();
        RomanResult secondRomanDigit = new RomanResult();
        if (result / 10 != 0) {
            roman += firstRomanDigit.getRomanValue(digitFirst);
        }
        if (result % 10 != 0) {
            roman += secondRomanDigit.getRomanValue(digitSecond);
        }
        return roman;
    }
}
