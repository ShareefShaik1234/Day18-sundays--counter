import java.util.*;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();   
        int n = sc.nextInt();     

        String[] d = {"mon","tue","wed","thu","fri","sat","sun"};

        int start = 0;
        for(int i=0;i<7;i++){
            if(d[i].equals(day)){
                start = i;
                break;
            }
        }

        int count = 0;
        for(int i=0;i<n;i++){
            if((start + i) % 7 == 0)
                count++;
        }

        System.out.println(count);
    }
}