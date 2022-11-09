package calc;

class VariableValue {
    VariableValue() {
    }

    int getVariableValue(String data) {
        int value = 0;
        try {
            value = Integer.parseInt(data);
            if (value > 10) {
                throw new IllegalArgumentException("Incorrect input!!! Number have to less or equal 10!!!");
            }
        } catch (Exception e) {
            try {
                RomanNumbers romanNumbers = RomanNumbers.valueOf(data);
                value = romanNumbers.getValue();
            } catch (Exception ex) {
                throw new IllegalArgumentException("Incorrect input!!! Numbers range have to for roman from I to X!!!");
            }
        } finally {
            if (value > 10 || value < 0) {
                throw new IllegalArgumentException("Incorrect input!!! Number range have to for arabian from 1 to 10!!!");
            }
        }
        return value;
    }
}
