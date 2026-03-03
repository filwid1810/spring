
public class Main {

    public static void main(String[] args) {
        float a = 5;//lokiec - nadgarstek
        float b = 5;//lokiec bark
        float c = 5;//bark nadgarstek
        double outa = ((b*b) + (c*c) -(a*a))/(2*b*c);
        outa = Math.acos(outa);
        outa = Math.toDegrees(outa);
        System.out.println(outa);

        double outb = ((a*a) + (c*c) -(b*b))/(2*a*c);
        outb = Math.acos(outb);
        outb = Math.toDegrees(outb);
        System.out.println(outb);

        double outc = ((a*a) + (b*b) -(c*c))/(2*a*b);
        outc = Math.acos(outc);
        outc = Math.toDegrees(outc);
        System.out.println(outc);



    }
}