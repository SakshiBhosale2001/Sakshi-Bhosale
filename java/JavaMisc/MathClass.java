package JavaMisc;

public class MathClass {
    public static void main(String[] args)
    {
        int x=10,y=45;
        double d=45.6;
        System.out.println("Minimum : "+Math.min(x,y));
        System.out.println("Minimum : "+Math.max(x,y));
        System.out.println("SquareRoot : "+Math.sqrt(x));
        System.out.println("d ^ 8 (Power Function) :"+Math.pow(d,8));
        System.out.println("FloorDivision : "+Math.floorDiv(y,x));
        System.out.println("Random Number : "+Math.random());
        System.out.println("Absulute value : "+Math.abs(x));
        System.out.println(" Absulute Exact : "+Math.absExact(x));
        System.out.println("Add Exact"+Math.addExact(x,y));
        System.out.println("acos() : "+Math.acos(d));
        System.out.println("asin(d) : "+Math.asin(d));
        System.out.println("atan(d) : "+Math.atan(d));
        System.out.println("atan2(d) : "+Math.atan2(23,d));
        System.out.println("cubeRoot : "+Math.cbrt(d));
        System.out.println("ceilDiv : "+Math.ceilDiv(x,y));
        System.out.println("ceilMod : "+Math.ceilMod(x,y));
        System.out.println("cos() : "+Math.cos(d));
        System.out.println("Hyperbolic cos() "+Math.cosh(d));
        System.out.println("Exponential : "+Math.exp(d));
        System.out.println("log base to e : "+Math.log(d));
        System.out.println("log "+Math.log1p(d));
        System.out.println("log base 10 : "+Math.log10(d));
        System.out.println("nextUp : "+Math.nextUp(d));
        System.out.println("nextDown : "+Math.nextDown(d));
        System.out.println("Round : "+Math.round(d));
        System.out.println("Signum : "+Math.signum(d));
        System.out.println("Radian : "+Math.toRadians(d));
        System.out.println("Degree : "+Math.toDegrees(d));

    }
}
