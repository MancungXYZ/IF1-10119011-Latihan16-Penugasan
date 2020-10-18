/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan16.penugasan;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);
        System.out.println("Nilai C = " + c + "\n");
        
        c = a + b;
        System.out.println("C = A + B = " + c);
        c += a;
        System.out.println("C += A = " + c);
        c -= a;
        System.out.println("C -= A = " + c);
        c *= a;
        System.out.println("C *= A = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("C /= A = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("C %= A = " + c);
        c <<= 2;
        System.out.println("C <<=2 = " + c);
        c >>= 2;
        System.out.println("C >>=2 = " + c);
        c >>= 2;
        System.out.println("C <<=A = " + c);
        c &= a;
        System.out.println("C &=2 = " + c);
        c ^= a;
        System.out.println("C ^=A " + c);
        c |= 2;
        System.out.println("C |=A = " + c);
        
        
        
        
        
    }
    
}
