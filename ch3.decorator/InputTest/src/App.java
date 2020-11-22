public class App {
    public static void main(String[] args) throws Exception {
        LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(System.in);
        int c;
        while ((c = lowerCaseInputStream.read()) >= 0) {
            System.out.print((char) c);
        }
        lowerCaseInputStream.close();
    }
}
