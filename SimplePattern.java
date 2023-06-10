import java.util.Scanner;
class SimplePattern{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0) a+=1;
        int h=(a/2)+1;
        int x=a/2,y=h+1;
        System.out.println(x+"\t"+y);
        for(int i=0;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(x<j && j<y) System.out.print("*");
                else System.out.print("#");
            }
            System.out.println();
            x-=1;
            y+=1;
            if(x<0 || y>a) break;
        }
    }
}