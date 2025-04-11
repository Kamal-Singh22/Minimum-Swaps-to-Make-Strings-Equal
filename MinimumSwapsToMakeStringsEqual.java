public class MinimumSwapsToMakeStringsEqual {

    public static int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a == 'x' && b == 'y') {
                xy++;
            } else if (a == 'y' && b == 'x') {
                yx++;
            }
        }

        // If the total number of mismatches is odd, it's not possible to fix them
        if ((xy + yx) % 2 != 0) return -1;

        // Each pair of xy or yx mismatches can be fixed in one swap
        // But one xy and one yx mismatch together will take 2 swaps
        return (xy / 2) + (yx / 2) + (xy % 2) * 2;
    }

    public static void main(String[] args) {
        String s1 = "xyxy";
        String s2 = "yxyx";

        int result = minimumSwap(s1, s2);
        System.out.println("Minimum swaps needed: " + result);
    }
}
