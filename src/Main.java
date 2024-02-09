public class Main {
    private static int[] comb;

    public static void main(String[] args)
    {


        int arr1[] = { 11,22,33,45 };
        int arr2[] = { 1,2,3 };


        comb_Arr(arr1,arr2);

    }

    public static int[] comb_Arr  (  int arr1[], int arr2[])
    {
        for (int i = 0; i < 4; i++)
        {
//            System.out.print(arr1[i] + ", " + arr2[i] + ",");

            comb = arr1[i].concat(arr2[i]);
        }
        return comb;
    }
}