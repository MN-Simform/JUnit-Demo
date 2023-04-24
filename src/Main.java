public class Main {

    public int sumArr(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}