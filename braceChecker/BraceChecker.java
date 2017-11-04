package braceChecker;

public class BraceChecker {

        private String text;
        private  String errorMessage = "";

        public BraceChecker(String text) {
            this.text = text;
        }
        public void check() {
            Stack stack = new Stack();
            for (int i = 0; i < text.length(); i++) {
                switch (text.charAt(i)) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(text.charAt(i));
                        break;
                    case ')':
                        if (stack.pop() != '(') {
                            errorMessage += "Error at " + i + "Closed ) but opened ";
                            break;
                        } else {
                            errorMessage += "Error at " + i + "Closed ) but opened ";
                            break;
                        }

                    case ']':
                        if (stack.pop() != '[') {
                            errorMessage += "Error at " + i + "Closed ) but opened ";
                            break;
                        } else {
                            errorMessage += "Error at " + i + "Closed ) but opened ";
                            break;
                        }

                    case '}':
                        if (stack.pop() != '{') {
                            errorMessage += "Error at " + i + "Closed ) but opened ";
                            break;
                        } else {
                            errorMessage += "Error at " + i + "Closed ) but opened ";
                            break;
                        }
                }
                if(errorMessage.equals("")){
                    System.out.println("Everyting its ok");
                }else {
                    System.out.println(errorMessage);
                }
            }

        }

}