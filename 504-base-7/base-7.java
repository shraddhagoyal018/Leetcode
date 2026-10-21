
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        if (num < 0) return "-" + convertToBase7(-num);

        return convert(num);
    }

    String convert(int m) {
        if (m < 7) return String.valueOf(m);

        return convert(m / 7) + (m % 7);
    }
}
