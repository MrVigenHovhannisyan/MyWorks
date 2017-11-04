package arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil ArrayUtil = new ArrayUtil();
        int[] arr1 = {44, 52, 3, 60, 8, 10, 30, 1, 74, 90};
        int[] arr2 = {-2, 52, 200, 60, 8, 10, 30, 1, 74, 90};
        ArrayUtil.maxOfArray(arr1);
        ArrayUtil.minOfArray(arr2);
        ArrayUtil.comonElements(arr1,arr2);


    }
}
