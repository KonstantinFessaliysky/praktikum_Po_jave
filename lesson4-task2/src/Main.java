//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListOfStrings s1 = new ListOfStrings();
        s1.addstr("aaaa");
        s1.addstr("aa");
        s1.addstr("aaaaaa");
        s1.addstr("aa");
        s1.addstr("a");
        s1.addstr("aaa");
        s1.addstr("a");
        System.out.println( s1.getStroki());
        s1.maxelement();
        s1.median_length();
    }
}