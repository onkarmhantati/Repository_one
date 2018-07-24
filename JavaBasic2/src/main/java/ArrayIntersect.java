/**
 * Created by onkar.mhantati on 6/4/2018.
 */
public class ArrayIntersect {
    public static void main(String[] args) {
        int a[]={2,5,6,8,6};
        int b[]={2,5,3,6,6};

        int c[]=findIntersectWithDuplicate(a,b);
        for (int i=0;i<c.length;i++)
            System.out.println(c[i]);
    }
    public static int[] findIntersectWithDuplicate(int a [],int b[]){
        int count=0;
            int result[]=new int[a.length];
            for(int i=0;i<a.length;i++){
                for (int j=0;j<a.length;j++){
                    if(a[i]==b[j]){
                        result[count]=a[i];
                        count++;
                        break;
                    }
                }
            }
            return result;
    }

}
