class Oh {
    public static int solution(int N) {
        boolean isPositive = N >= 0;
        int startIdx = (isPositive)? 0:1;

        String NInString = Integer.toString(N);
        char[] numbers = NInString.toCharArray();

        int resultIdx = isPositive? 0:numbers.length;
        for (int i=startIdx; i < numbers.length; i++) {
            if ((isPositive && '5' >= numbers[i]) || (!isPositive && '5' <= numbers[i])) {
                resultIdx = i;
                break;
            }
        }

        return Integer.parseInt(NInString.substring(0, resultIdx) + "5" + NInString.substring(resultIdx));
    }
}
