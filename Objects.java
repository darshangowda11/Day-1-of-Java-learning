class Computer {
    public void getMepen() {
        System.out.println("Mouse");
    }

    public String getMeValue(int v) {
        if (v > 9) {
            return "The value is greater than 9";
        } else {
            return "The value is less than or equal to 9";
        }
    }
}

public class Objects {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.getMepen();
        String str = c.getMeValue(10);
        System.out.println(str);
    }
}
