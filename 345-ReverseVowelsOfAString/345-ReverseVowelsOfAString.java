// Last updated: 8/11/2026, 11:26:10 AM
class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (vowels.indexOf(arr[i]) == -1) {
                i++;
                continue;
            }
            if (vowels.indexOf(arr[j]) == -1) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
