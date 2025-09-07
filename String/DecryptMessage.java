/*
Input: world hel2o

Output: hello world
*/


class Result {
    public static String decryptMessage(String encryptedMessage) {
        String[] arr = encryptedMessage.split(" ");
        StringBuilder sb = new StringBuilder();
        // Traverse from end to start (to reverse word order)
        for (int i = arr.length - 1; i >= 0; i--) {
            String word = arr[i];
            StringBuilder expanded = new StringBuilder();
            
            // Expand compressed characters
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j + 1 < word.length() && Character.isDigit(word.charAt(j + 1))) {
                    int count = word.charAt(j + 1) - '0';
                    for (int k = 0; k < count; k++) {
                        expanded.append(c);
                    }
                    j++; // skip digit
                } else {
                    expanded.append(c);
                }
            }
            
            sb.append(expanded);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
