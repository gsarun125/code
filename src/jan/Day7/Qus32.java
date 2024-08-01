package jan.Day7;

/*
32. Password Strength
Find the strength of the given password string based on the conditions
Four rules were given based on the type and no. of characters in the string.
Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
Medium – Two rules are satisfied
Good – Three rules satisfied
Strong – All Four rules satisfied
I/P: Qw!1 O/P: Weak
I/P: Qwertyuiop O/P: Medium
I/P: QwertY123 O/P: Good
I/P: Qwerty@123 O/P: Strong
 */
public class Qus32 {
    public static void main(String[] args) {
        String password1 = "Qw!1";
        String password2 = "Qwertyuiop";
        String password3 = "QwertY123";
        String password4 = "Qwerty@123";

        System.out.println(findPasswordStrength(password1)); // Output: Weak
        System.out.println(findPasswordStrength(password2)); // Output: Medium
        System.out.println(findPasswordStrength(password3)); // Output: Good
        System.out.println(findPasswordStrength(password4));
    }
    public static String findPasswordStrength(String password) {
        // Rule 1: Contains at least one uppercase letter
        boolean rule1 = password.matches(".*[A-Z].*");

        // Rule 2: Contains at least one lowercase letter
        boolean rule2 = password.matches(".*[a-z].*");

        // Rule 3: Contains at least one digit
        boolean rule3 = password.matches(".*\\d.*");

        // Rule 4: Contains at least one special character
        boolean rule4 = password.matches(".*[!@#$%^&*()].*");

        // Determine the strength based on the rules
        if (rule1 && !rule2 && !rule3 && !rule4) {
            return "Weak";
        } else if ((rule1 && rule2) || (rule1 && rule3) || (rule1 && rule4) || (rule2 && rule3) || (rule2 && rule4) || (rule3 && rule4)) {
            return "Medium";
        } else if ((rule1 && rule2 && rule3) || (rule1 && rule2 && rule4) || (rule1 && rule3 && rule4) || (rule2 && rule3 && rule4)) {
            return "Good";
        } else if (rule1 && rule2 && rule3 && rule4) {
            return "Strong";
        } else {
            return "Weak"; // Default to Weak if none of the above conditions are met
        }
    }
}
