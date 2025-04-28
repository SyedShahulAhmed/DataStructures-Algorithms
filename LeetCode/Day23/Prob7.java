package LeetCode.Day23;

public class Prob7 {

    public static String interpret(String command) {
        command =command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
    }
}