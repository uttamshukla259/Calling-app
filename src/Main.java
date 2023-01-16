public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("123");
        Landline l2 = new Landline("456");
        l1.callNumber("456");
        l2.reciveCall("456");
        System.out.println(l2.answerCall());
    }
}