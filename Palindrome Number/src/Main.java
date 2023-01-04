public class Main {
    public boolean isPalindroma(int x) {
        if (x < 0) return false;

        int reverse = 0, copy = x;

        while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
        }

        return reverse == x;
    }
}