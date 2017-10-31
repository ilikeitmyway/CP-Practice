import java.util.*;
public class LargestRectangleHistogram{

    static int largestRectangle(int hist[], int n){
        Stack<Integer> s = new Stack<>();
        int top;
        int area_with_top;
        int max_area=0;
        int i=0;
        while(i<n){
            if(s.empty() || hist[s.peek()] <= hist[i] ){
                s.push(i++);
            }
            else{
                top = s.peek();
                s.pop();
                area_with_top = hist[top] * (s.empty()?i:i-s.peek()-1);
                if(max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while(s.empty() == false){
            top = s.peek();
            s.pop();
            area_with_top = hist[top]*(s.empty()?i:i-s.peek()-1);
            if(max_area < area_with_top)
                max_area = area_with_top;
        }
        return max_area;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i_t=0 ; i_t<t ; i_t++){
            int n = scn.nextInt();
            int hist[] = new int[n];
            for(int i_n=0 ; i_n<n ; i_n++){
                hist[i_n] = scn.nextInt();
            }
            System.out.println(largestRectangle(hist, n));
        }
    }


}