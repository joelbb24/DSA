package Strings;

public class RemoveChar {
    public static void main(String[] args) {
        RemoveChar rc = new RemoveChar();
        String str = "banana";
        char ch = 'a';
        System.out.println(rc.remove(str, ch));
    }

    public String remove(String str, char ch)
    {
        return str.replaceAll("a","");
    }
}
