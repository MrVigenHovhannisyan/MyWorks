package string;

public class StringUtil {
    public String trim(String text) {
        int first = 0;
        int last = text.length() - 1;
        while (text.charAt(first) == ' ') {
            first++;
        }
        while (text.charAt(last) == ' ') {
            last--;
        }
        return text.substring(first, last + 1);
    }

    public int getCountBySymbol(String text, char symbol) {
        int temp = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                temp++;
            }
        }
        return temp;
    }

    public String middleTwo(String str) {
        char[] ch = new char[2];
        if (str.length() % 2 == 0) {
            str.charAt(str.length() / 2);
            ch[0] = str.charAt(str.length() / 2 - 1);

        } else {
            ch[1] = str.charAt(str.length() / 2);

        }
        return new String(ch);
    }

    public boolean endsLy(String str) {
        if (str.charAt(str.length() - 1) == 'l' && str.charAt(str.length() - 2) == 'y') {
            return true;
        } else {
            return false;
        }
    }

    public String theEndOrFront(String str, boolean front) {
        if (front) {
            return " " + (str.charAt(0));

        } else {
            return " " + (str.charAt(str.length() - 1));
        }
    }

    public boolean hasBad(String str) {
        if (str.charAt(0) == 'b' && str.charAt(1) == 'a' && str.charAt(2) == 'd') {
            return true;
        } else if (str.charAt(1) == 'b' && str.charAt(1) == 'a' && str.charAt(2) == 'd') {
            return true;
        } else {
            return false;
        }
    }

    public String firstTwo(String str) {
        char[] ch = {str.charAt(0), str.charAt(1)};
        return new String(ch);

    }

    public boolean bobThere(String str) {
        if (str.length() < 3) {
            return false;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'b' && ch[i + 2] == 'b') {
                return true;
            }

        }
        return false;
    }

    public String repeatEnd(String str, int n) {
        if (str.length() < n) {
            return "sxal";
        }
        char[] ch = str.toCharArray();
        char[] ch1 = new char[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = ch.length - n; j < ch.length; j++) {
                ch1[index] = ch[j];
                index++;

            }

        }
        return new String(ch1);
    }

    public String mixString(String a, String b) {
        char[] ch = a.toCharArray();
        char[] ch1 = b.toCharArray();
        char[] ch2 = new char[ch.length + ch1.length];
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            ch2[index] = ch[i];
            if (index < ch.length * 2 - 1) {
                index += 2;
            } else {
                index++;
            }
        }
            index = 1;
            for (int i = 0; i < ch1.length; i++) {
                ch2[index] = ch1[i];
                if (index < ch.length * 2 - 1) {
                    index += 2;
                } else {
                    index++;
                }
        }
        return new String(ch2);


    }
    public String reverse(String str){
        char[]ch = str.toCharArray();
        char[]ch1=new char[str.length()];
        int index = 0;
        for (int i = ch.length-1; i>=0;i--) {
            ch1[index] = ch[i];
            index++;


        }
    return new  String(ch1);
    }

}




