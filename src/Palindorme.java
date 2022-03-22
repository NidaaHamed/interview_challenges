import java.util.stream.IntStream;

public class Palindorme {
    public static boolean palindromeCheckerTraditional(String original) {
        String normalized = original.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        // String reversed = StringUtils.reverse(normalized);
        // String reversed = new StringBuilder(normalized);

        for(int i=normalized.length()-1 ; i>=0 ; i--) {
            reversed.append(normalized.charAt(i));
        }

        return normalized.equals(reversed.toString());
    }
    public static boolean palindromeCheckStreams(String original) {
        String normalized = original.toLowerCase();

        return IntStream.range(0, normalized.length()/2).allMatch(i ->
                normalized.charAt(i)==
                        normalized.charAt(normalized.length()-i-1));
    }
    public static void main(String[] args) {
        String s1 = "redivider";
        String s2 = "deified";
        String s3 = "civic";
        String s4 = "wifi";
        String s5 = "reviver";
        String s6 = "racecar";

//        System.out.println(palindromeCheckerTraditional(s1));
//        System.out.println(palindromeCheckerTraditional(s2));
//        System.out.println(palindromeCheckerTraditional(s3));
//        System.out.println(palindromeCheckerTraditional(s4));
//        System.out.println(palindromeCheckerTraditional(s5));
//        System.out.println(palindromeCheckerTraditional(s6));

        System.out.println(palindromeCheckStreams(s1));
        System.out.println(palindromeCheckStreams(s2));
        System.out.println(palindromeCheckStreams(s3));
        System.out.println(palindromeCheckStreams(s4));
        System.out.println(palindromeCheckStreams(s5));
        System.out.println(palindromeCheckStreams(s6));
    }

}
