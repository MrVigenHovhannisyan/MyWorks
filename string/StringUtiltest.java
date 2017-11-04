package string;

public class StringUtiltest {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        String str = "Hello";
        String str2 = "Hello";

        System.out.println(stringUtil.trim(str));
        System.out.println(stringUtil.getCountBySymbol(str, 'l'));
        System.out.println(stringUtil.middleTwo(str));
        System.out.println(stringUtil.endsLy(str));
        System.out.println(stringUtil.theEndOrFront(str, false));
        System.out.println(stringUtil.hasBad(str));
        System.out.println(stringUtil.firstTwo(str));
        System.out.println(stringUtil.bobThere(str));
        System.out.println(stringUtil.repeatEnd(str, 3));
        System.out.println(stringUtil.mixString(str, str2));
        System.out.println(stringUtil.reverse(str));
    }


}

