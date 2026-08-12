import java.util.*;
public class nextGreaterElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }

        for(int i=n-1;i>=0;i--){

            if(st.isEmpty()){
              ans[i]=-1;
              st.push(arr[i]);
            }

            else if(arr[i] < st.peek()){
                ans[i] = st.peek();
                st.push(arr[i]);
            }
            else{
                 while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]= -1;
                    st.push(arr[i]);
                    
                }
                else{
                    ans[i] = st.peek();
                    st.push(arr[i]);
                }
                
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+ " ");
        }
        
    }
}