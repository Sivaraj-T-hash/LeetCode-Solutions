class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String a[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> b=new HashSet<>();
        for(int i=0;i<words.length;i++){
            StringBuilder t=new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                t.append(a[words[i].charAt(j)-'a']);
            }
            b.add(t.toString());
        }
        return b.size();

    }
}