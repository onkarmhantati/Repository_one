/**
 * Created by onkar.mhantati on 5/9/2018.
 */
public class FindDuplicateInt {
    public static void main(String[] args) {
        int a[]={1,4,5,2,1,5};
        duplicateBasic(a);
        //duplicateCount(a);
        //duplicateTwoEquations(a);
    }

    public static void duplicateBasic(int [] a){
        int flag=0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==1) {
                flag=0;
                System.out.println("Duplicate: " + a[i]);
            }
        }
    }

    public static void duplicateCount(int [] a){
        int length=a.length;
        int flag=0;
        int count[] = new int[length];
        for(int i=0;i<length;i++){
        if(count[a[i]]==1)
            System.out.println(a[i]);
        else
            count[a[i]]++;
        }
    }

    public static void duplicateTwoEquations(int [] a){
        int s=0;
        int p=1;
        int x,y,i,d;
        int n=a.length-2;
        for(i=0;i<a.length;i++){
            s=s+a[i];
            p=p*a[i];
        }
        s=s-(n*(n+1)/2);
        p=p/fact(n);

        d=(int)Math.sqrt(s*s-4*p);

        x=(d+s)/2;
        y=(s-d)/2;

        System.out.println(x+" , "+y);
    }

    public static int fact(int n){
        return (n==0)?1:n*fact(n-1);
    }
}
