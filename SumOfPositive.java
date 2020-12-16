public class SumOfPositive {

    public static int sum(int[] a) {
        int result = 0;

        for(int i = 0; i<=a.length-1;i++){

            if (a[i]>0){
                result+=a[i];
            }
        }
            return result;
        }

    public static void main(String[] args) {
        int[] list0 = new int[]{1,2,3,4,5};

        System.out.println(sum(list0));
    }
}








