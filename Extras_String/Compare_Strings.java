import java.util.Scanner;

public class Compare_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first string
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        // Taking input for the second string
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // Compare the strings lexicographically using compareTo()
        if (str1.compareTo(str2) < 0) {
            // If str1 comes before str2 in lexicographical order
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (str1.compareTo(str2) > 0) {
            // If str1 comes after str2 in lexicographical order
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {
            // If both strings are equal
            System.out.println("Both strings are equal");
        }
    }
}
