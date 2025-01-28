public class StringOperations {
    // Create a string
    public static void main(String[] args) {
        // The string "Hello, World!" is created
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);
        // 1. Convert it to uppercase
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
        // 2. Find its length
        int length = originalString.length();
        System.out.println("Length of String: " + length);
        // 3. Replace a character with another
        String replacedString = originalString.replace('o', 'a');
        System.out.println("String after replacing 'o' with 'a': " + replacedString);
        // 4. Extract a substring
        String substring = originalString.substring(7, 12); // The substring starts at index 7 and ends at index 11
        // Print the extracted substring
        System.out.println("Extracted Substring: " + substring);
    }
}

