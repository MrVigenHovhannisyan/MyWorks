package dynamicArray;

public class DynamicArrayTest {


    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(16);
        dynamicArray.add(115);
        dynamicArray.add(155);
        dynamicArray.add(515);
        dynamicArray.add(999);
        dynamicArray.add(111);
        dynamicArray.add(888);
        dynamicArray.add(111);
        dynamicArray.add(5151);
        dynamicArray.add(1556);
        dynamicArray.add(160);
        dynamicArray.add(160);
        dynamicArray.add(160);
        dynamicArray.add(186);
        dynamicArray.add(1996);
        dynamicArray.add(1556);
        dynamicArray.print();
        System.out.println(dynamicArray.calculateAvarage());
        dynamicArray.printIndexByValue(186);
        System.out.println(dynamicArray.containts(160));

    }


}
