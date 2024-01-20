class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String str : words) {
            String[] stemp = str.split("\\"+separator);
            for (String s : stemp) {
                if (!s.isEmpty()) {
                    res.add(s);
                }
            }
        }
        return res;
    }
}
