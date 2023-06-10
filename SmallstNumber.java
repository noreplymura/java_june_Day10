import java.util.*;
class SmallstNumber{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The no.of Elements you want to store");
        int n=s.nextInt();
        int a[]=new int[n];
        int sum=0,count=0;
        System.out.println("Enter the all elements");
        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
       for (int i=0;i<a.length;i++){
           for (int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter the position of small valuee you want");
        int small=s.nextInt();
        System.out.println("Emter the position of high value you want");
        int high=s.nextInt();
        for (int i=0;i<a.length;i++){
            sum+=a[i];
            count++;
        }
        System.out.println(a[small-1]+"\t"+a[high-1]+"\n"+sum+"\n"+(sum/count));

    }
}