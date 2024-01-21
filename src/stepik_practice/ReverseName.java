package stepik_practice;

public class ReverseName {
    public static void main(String[] args) {

        String name = "Tima Kishchuk";

        StringBuilder reverseNameBuilder = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            char a = name.charAt(i);
            reverseNameBuilder.append(a);
        }
        String reverseName = reverseNameBuilder.toString();

        System.out.println(reverseName);
    }
}
// k -> one cell
// ku -> two cells + one cell (previous iter)
// kuh -> three cells + three cells (prev iter)
// kuhc -> four cells + six cells (prev iter)
// kuhch -> five cells + 10 cells (prev iter)
