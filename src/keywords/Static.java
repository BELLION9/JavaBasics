package keywords;

class Static {
    static int count = 0;

    static {
        count = 5;
        System.out.println("Static block: count = " + count);
    }

    static void display() {
        System.out.println("Static method: count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Static variable: count = " + count);
        Static.display();
    }
}
