import java.util.*;

public class StockSpan {

    public static void evaluate(int arr[], int n){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int span[] = new int[n];
        span[0] = 1;
        for(int i =1;i<n;i++){
            while(!st.empty() && arr[st.peek()]<=arr[i])
                st.pop();
            span[i] = (st.empty()) ? (i+1):(i-st.peek());
            st.push(i);
        }
        for(int j=0;j<span.length;j++){
            System.out.print(span[j]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for(int i_t = 0;i_t<t;i_t++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = scn.nextInt();
            }
            evaluate(arr, n);
        }
        
    }

}