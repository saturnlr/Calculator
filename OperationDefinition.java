package calc;

class OperationDefinition {
    OperationDefinition() {
    }
     String getOperation(String input) {
        String[] operationDefinition = input.split("");
        String operation = null;
        int count=0;
        for (int i = 0; i < input.length(); i++) {
            if (operationDefinition[i].equals("+")) {
                operation = operationDefinition[i];
                count++;
            } else if (operationDefinition[i].equals("-")) {
                operation = operationDefinition[i];
                count++;
            } else if (operationDefinition[i].equals("*")) {
                operation = operationDefinition[i];
                count++;
            } else if (operationDefinition[i].equals("/")) {
                operation = operationDefinition[i];
                count++;
            }
        }
         if (count >1) {
             throw new IllegalArgumentException("Incorrect input!!! Operation one only!!!");
         }
        return operation;
    }
}
