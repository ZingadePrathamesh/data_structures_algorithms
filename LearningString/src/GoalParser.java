public class GoalParser {
    public static void main(String[] args) {
        String word = "G()(al)";
        String word2 = "G()()()()(al)";
        String word3 = "(al)G(al)()()G";

        System.out.println(interpret(word));
        System.out.println(interpret(word2));
        System.out.println(interpret(word3));
    }
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                i++;
                str.append('G');
            }
            else{
                if(command.charAt(i+1) == ')'){
                    str.append('o');
                    i+=2;
                }
                else{
                    str.append("al");
                    i+=4;
                }
            }
        }
        return str.toString();
    }
}
