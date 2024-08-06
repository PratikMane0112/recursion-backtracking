/* 01: Permutations of a given string
Given a string S. The task is to print all unique permutations of the given string.

Example 1:
Input: ABC
Output: ABC ACB BAC BCA CAB CBA

Example 2:
Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA

Complexity :
T-O(N*N!) S-O(N)
*/



class Solution {
    public static void dfs(String str, String perm, List<String> list) {
        if (str.length() == 0) {
            list.add(perm);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String tmp = str.substring(0, i) + str.substring(i + 1);
            dfs(tmp, perm + ch, list);
        }
    }
    public List<String> find_permutation(String S) {
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
}
