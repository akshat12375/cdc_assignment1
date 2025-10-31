public class remove_duplicate_elements {
 public static void main(String[] args) {
    int ar[]={1,2,3,4,3,4};
    for(int i=0;i<ar.length;i++)
    {
        int it=Math.abs(ar[i]);
        if(ar[it]<0)
        {
            System.out.println(it);
        }
        else{
            ar[it]=ar[it]*-1;
        }
    }
 }   
}
