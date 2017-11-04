package dynamicArray;

public class DynamicArray {

    private int[] array = new int[16];

    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];


        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public int calculateAvarage() {
        int num = 0;
        for (int i = 0; i < size; i++) {
            num += array[i];

            }

            return num/size;
        }

public void printIndexByValue(int value) {
    for (int i = 0; i < size; i++) {
        if (array[i] == value) {
            System.out.println(i + " ");
        }
    }
}
public boolean containts(int value){
    for (int i = 0; i <size; i++) {
        if(array[i] == value){
            return true;
        }

    }
return false;
}

}
















