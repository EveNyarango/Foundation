package oi.turntabl.functional_programming.immutability;

public class ThinkImmutable {
    private int x;
    ThinkMutable thinkMutable;

    public ThinkImmutable(int x, ThinkMutable thinkMutable) {
        this.x = x;
        this.thinkMutable = thinkMutable;
    }

    public int getX(int i) {
        return this.x;
    }

    public static void main(String[] args) {
       ThinkImmutable thinkImmutable = new ThinkImmutable(2, new ThinkMutable(3));
//       ThinkMutable thinkMutable = thinkImmutable.getX(9);
    }
}
