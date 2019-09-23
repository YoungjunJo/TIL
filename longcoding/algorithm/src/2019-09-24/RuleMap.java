class RuleMap {

    public static int solution(String S) {
        Map<Character, Integer> ruleMap = new HashMap<>();
        ruleMap.put('B', 1);
        ruleMap.put('A', 1);
        ruleMap.put('L', 2);
        ruleMap.put('O', 2);
        ruleMap.put('N', 1);

        Map<Character, Integer> userInputMap = new HashMap<>();
        for (char ch : S.toCharArray()) {
            userInputMap.put(ch, userInputMap.getOrDefault(ch, 0) + 1);
        }

        int result = 0;
        while (true) {
            for (char key : ruleMap.keySet()) {
                if (userInputMap.get(key) >= ruleMap.get(key)) {
                    userInputMap.put(key, userInputMap.get(key) - ruleMap.get(key));
                } else {
                    return result;
                }
            }
            result++;
        }
    }

}
