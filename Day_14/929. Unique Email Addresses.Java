import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        String[] res = new String[emails.length];
        for (int i = 0; i < emails.length; i++) {
            String[] tmp = emails[i].split("@");
            tmp[0] = tmp[0].replace(".", "");
            int plusIndex = tmp[0].indexOf("+");

            if (plusIndex != -1) {
                tmp[0] = tmp[0].substring(0, plusIndex);
            }
            res[i] = tmp[0] + "@" + tmp[1];
        }

        Set<String> set = new HashSet<>();
        for (String s : res) {
            set.add(s);
        }

        return set.size();
    }
}