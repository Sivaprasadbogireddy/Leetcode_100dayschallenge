class Solution {
    public int minimumPushes(String word) {
        int res=0, round=1, temp=0;
        String newstr=sortStringByFrequency(word);
        Map<Character, Integer> map=new HashMap<>();
        for(char ch:newstr.toCharArray()){
            if(temp==8){
                round=round+1;
                temp=0;
            }
            if(!map.containsKey(ch)){
                map.put(ch, round);
                temp++;
            }
        }
        for(char ch:newstr.toCharArray()){
            res=res+map.get(ch);
        }
        return res;
    }
    
    public static String sortStringByFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        Comparator<Character> frequencyComparator = (c1, c2) -> {
            int frequency1 = frequencyMap.get(c1);
            int frequency2 = frequencyMap.get(c2);

            if (frequency1 != frequency2) {
                return Integer.compare(frequency2, frequency1); 
            } else {
                return Character.compare(c1, c2); 
            }
        };

        List<Character> charList = new ArrayList<>(input.length());
        for (char c : input.toCharArray()) {
            charList.add(c);
        }
        charList.sort(frequencyComparator);

        StringBuilder result = new StringBuilder(charList.size());
        for (char c : charList) {
            result.append(c);
        }

        return result.toString();
    }
}