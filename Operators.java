
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // assignment operator assigns value to variable
        int c = a++;
        int d = ++b;
        System.out.println(c);
        System.out.println(d);

        // logical operator returns boolean
        boolean e = a > b || a < b;
        boolean f = a != b && b > a;
        System.out.println(e);
        System.out.println(f);

        //ternery operator
        String h= (a>b)? "darshann" : "raj";
        System.out.println(h);

    }
}
