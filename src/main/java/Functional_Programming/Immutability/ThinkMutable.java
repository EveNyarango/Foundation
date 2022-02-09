package Functional_Programming.Immutability;

public class ThinkMutable {

    private  int x;

    public ThinkMutable(int x){
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
//        join
        String s = "a";
        s = s.concat("b");

        System.out.println(s);

        StringBuilder sb = new StringBuilder("a");
        sb.append("b");
        System.out.println(sb);

        String t = "s";
        t = t + "c";
        System.out.println(t);

        StringBuilder tb = sb;
        tb.append("c");
        System.out.println(tb);

    }
}
