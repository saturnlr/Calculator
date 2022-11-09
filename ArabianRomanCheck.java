package calc;

class ArabianRomanCheck {
    ArabianRomanCheck() {
    }

    boolean romanCheck(String firstValue, String secondValue) {
        int countArabian = 0;
        int countRoman = 0;
        boolean flag = true;
        try {
            Integer.parseInt(firstValue);
            countArabian++;
        } catch (Exception e) {
            try {
                RomanNumbers firstRomanNumbers = RomanNumbers.valueOf(firstValue);
                firstRomanNumbers.getValue();
                countRoman++;
            } catch (Exception ex) {
            }
        }
        try {
            Integer.parseInt(secondValue);
            countArabian++;
        } catch (Exception e) {
            try {
                RomanNumbers secndRomanNumbers = RomanNumbers.valueOf(firstValue);
                secndRomanNumbers.getValue();
                countRoman++;
            } catch (Exception ex) {
            }
        }
        if (countArabian == 0 && countRoman == 0) {
            throw new IllegalArgumentException("Incorrect input!!! Numbers range have to for roman from I to X!!!");
        }
        if (countArabian != 2 && countRoman != 2) {
            throw new IllegalArgumentException("Incorrect input!!! Different number systems!!!");
        }
        if (countRoman == 2) {
            flag = !flag;
        }
        return flag;
    }
}