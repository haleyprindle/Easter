//Haley
//Calculates the day Easter falls on a given year

public class Easter {
    public static voice main (String[] args){
    //code here
    int y = 2026;
    int a = y%19;
    System.out.println("a = " +a);
    int b = y/100;
    System.out.println("b = " +b);
    int c = y%100;
    System.out.println("c = " +c);
    int d = b/4;
    System.out.println("d = " +d);
    int e = b%4;
    System.out.println("e = " +e);
    int f = (b+8)/25;
    System.out.println("f = " +f);
    int g = (b-f+1)/3;
    System.out.println("g = " +g);
    int h = ((19*a)+b-d-g+15)%30;
    System.out.println("h = " +h);
    int i = c/4;
    System.out.println("i = " +i);
    int k = k%4;
    System.out.println("k = " +k);
    int r = (32+2*e+2*i-h-k)%7;
    System.out.println("r = " +r);
    int m = (a+11*h+22*r)/451;
    System.out.println("m = " +m);
    int n = (+r-7*m+114)/31;
    System.out.println("n = " +n);
    int p = (+r-7*m+114)%31;
    System.out.println("p = " +p);
}}
