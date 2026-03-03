
public class Main {

    public static void main(String[] args) {
        float a = 5;//lokiec - nadgarstek
        float b = 3;//lokiec bark
        float c = 4;//bark nadgarstek
        double outa = ((b*b) + (c*c) -(a*a))/(2*b*c);
        outa = Math.acos(outa);
        outa = Math.toDegrees(outa);
        System.out.println(outa);

        float noga = 4;
        float noga2 = 4;
        float noga3 = 5;
        double outb = ((noga*noga) + (noga3*noga3) -(noga2*noga2))/(2*noga*noga3);
        outb = Math.acos(outb);
        outb = Math.toDegrees(outb);
        System.out.println(outb);


        float biodr1 = 2;
        float biodr2 = 2;
        float biodr3 = 2;
        double outc = ((biodr1*biodr1) + (biodr2*biodr2) -(biodr3*biodr3))/(2*biodr1*biodr1);
        outc = Math.acos(outc);
        outc = Math.toDegrees(outc);
        System.out.println(outc);



    }
}