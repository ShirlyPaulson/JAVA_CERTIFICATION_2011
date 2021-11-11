public class Test1{
    public final static void main(String[] args){
        double d = 10.0 / -0;
        if(d == Double.POSITIVE_INFINITY)
            System.out.println("Positive infinity");
        else
            System.out.println("Negative infinity");
        Test1 t = new Test1();
        t.aMethod();
    }
    void aMethod(){
        int j = 0XCAFE;
        //byte b = 128;
        //char c = ‘A’;
        //boolean b = 0;
        float f = (3 / 4) * 10;
        System.out.println("Float f = "+ f);
        //System.out.println("char c = "+ c);
        //System.out.println("byte b = "+ b);
        int i = Math.round(f);
        System.out.println(i);
    }
}