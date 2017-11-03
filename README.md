# arrayUtil
MyWorks
    public void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println("Max: " + max);
    }

    public void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min:" + min);

    }


    public void comonElements(int[] firstArray, int[] secondArray) {

        for (int i = 0; i < firstArray.length; i++)
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.println(firstArray[i]);
                }
            }
    }
}
