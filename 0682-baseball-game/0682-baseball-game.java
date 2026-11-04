class Solution {
    public int calPoints(String[] operations) {
        int len=operations.length;
        List<Integer> a=new ArrayList<>();
        int index=-1;
        for(int i=0;i<len;i++){
            char t=operations[i].charAt(0);
            String t2=operations[i];
            if(t=='D'){
                int t1=2*a.get(index);
                a.add(t1);
                index++;
            }
            else if(t=='C'){
                a.remove(index);
                index--;
            }
            else if(t=='+'){
                int t1=a.get(index)+a.get(index-1);
                a.add(t1);
                index++;
            }
            else{
                int t1=Integer.parseInt(t2);
                a.add(t1);
                index++;
            }
        }
        int sum=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
            System.out.print(a.get(i));
        }
        return sum;
    }
}