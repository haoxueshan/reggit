public class s {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int add=0;
        StringBuilder sum=new StringBuilder();
        while(i>=0 || j>=0){
            int n1=i>=0? num1.charAt(i):0;
            int n2=j>=0? num2.charAt(j):0;
            int tmp=n1+n2+add;
            add=tmp/10;
            sum.append(tmp%10);
        }

        return sum.reverse().toString();

    }

    public static void main(String[] args) {
        int i=2%10;
        System.out.println(i);
    }
}
