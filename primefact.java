package coding;
public class primefact {
    public static void main(String[] args) {
        int n=21;
        int i=2;
        while(n>0){
            if(isprime(i) && n%i==0){
                n/=i;
                System.out.print(i+" ");
            }
            else i++;
        }
    }
    public static boolean isprime(int i){
        if(i<=1) return false;
        for(int j=2;j<i/2;j++){
            if(i%j==0) return false;
        }
        return true;
    }
}
