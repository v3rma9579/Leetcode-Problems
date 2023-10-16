public class temp {
public static void main(String args[]) {
    int arr[] = {7, 1, 2};

    int carry = 0;
    for(int i=arr.length-1; i>=0; i--) {
        int temp = arr[i] + 1 + carry;
        arr[i] = temp % 10;
        carry = temp / 10;
    }

     
    if(carry > 1 ) {

    }
}
}
