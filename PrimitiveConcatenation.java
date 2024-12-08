public class PrimitiveConcatenation {
    public static void main(String[] args) {
        byte b = 72;
        short s = 3;
        int i = 1;
        char c = 'w';
        float f = 2.0f;
        boolean bool = true;

        String output = (char)(b) + "" + s + "11" + "0 " + c + "0r" + i + "d " + f + " " + bool;

        System.out.println(output);
    }
}