import java.util.*;

public class Complex {
    int r, i;
    Complex(){
        r=0;
        i=0;
    }
    Complex(int r, int i){
        this.r = r;
        this.i = i;
    }
    void addComplex(Complex ob1, Complex ob2){
        this.r = ob1.r + ob2.r;
        this.i = ob1.i + ob2.i;
        System.out.println(this.r+"+"+this.i+"i");
    }
    public static void main(String ar[]){
        Scanner sc =  new Scanner(System.in);
        Complex one = new Complex(4, 5);
        Complex two = new Complex(5, 3);
        Complex result = new Complex();

        result.addComplex(one, two);

    }
}
