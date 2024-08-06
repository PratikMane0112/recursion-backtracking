/* 01: Permutations of a given string
Given a string S. The task is to print all unique permutations of the given string .

Example 1:
Input: ABB
Output: ABB BBA BAB 

Complexity : 
T- O(N*N!) S-O(N)

*/

 public void dfs(String str, String perm, List<String> list) {
        if (str.length() == 0) {
            list.add(perm);
        }
        
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)){
            String tmp = str.substring(0, i) + str.substring(i + 1);
            dfs(tmp, perm + ch, list);
            }
            set.add(ch);
        }
    }
    public static List<String> find_permutation(String S) {
        List<String> list = new ArrayList<>();
        // *
        // ------- For lexicographically permutations ------
        // char[] arr = S.toCharArray();
        // Arrays.sort(arr); 
        // String str = new String(arr);
        // dfs(str, "", list);
        // *
        dfs(S, "", list);
        return list;
}
