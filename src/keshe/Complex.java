package keshe;

public class Complex {
    private int a;
    private int b;
    //构造方法
    public Complex(int a,int b){
        this.a = a;
        this.b = b;
    }
    //加法
    public static Complex add(Complex complex1,Complex complex2){
        int a = complex1.a+complex2.a;
        int b = complex1.b+complex2.b;
        return new Complex(a,b);
    }
    //减法
    public static Complex subtract(Complex complex1,Complex complex2){
        int a = complex1.a-complex2.a;
        int b = complex1.b-complex2.b;
        return new Complex(a,b);
    }
    //重写
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

}
