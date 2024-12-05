/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        MatematikaCanggih call = new MatematikaCanggih();

        //pertambahan
        call.pertambahan(7, 8);
        System.out.println("pertambahan 7 + 8 =" + call.mat);
        call.pertambahan(2.8, 8.3);
        System.out.println("pertambahan 2.8 + 8.3 =" + call.angka);
        call.pertambahan(9, 12, 8);
        System.out.println("pertambahan 9 + 12 + 8 =" + call.mat);
        call.pertambahan(1.5, 4.5, 2.7);
        System.out.println("pertambahan 1.5 + 4.5 + 2.7 =" + call.angka);
        
        //pengurangn
        call.pengurangan(10, 2);
        System.out.println("pertambahan 10 - 2 =" + call.mat);
        call.pengurangan(5.3, 7.8);
        System.out.println("pertambahan 5.3 - 7.8 =" + call.angka);
        call.pengurangan(5, 10, 13);
        System.out.println("pertambahan 5 - 10 - 13 =" + call.mat);
        call.pengurangan(32.5, 9.7, 11.5);
        System.out.println("pertambahan 32.5 - 9.7 - 11.5 =" + call.angka);
        
        //perkalian
        call.perkalian(2, 5);
        System.out.println("perkalian 2 * 5 =" + call.mat);
        call.perkalian(2.2, 3.3);
        System.out.println("perkalian 2.2 * 3.3 =" + call.angka);
        call.perkalian(2, 1, 10);
        System.out.println("perkalian 2 * 1 * 10 =" + call.mat);
        call.perkalian(1.5, 3.4, 5.7);
        System.out.println("perkalian 1.5 * 3.4 * 2.2 =" + call.angka);
        
        //pembagian
        call.pembagian(10, 5);
        System.out.println("pembagian 10 / 5 =" + call.mat);
        call.pembagian(30.5, 5.5);
        System.out.println("pembagian 30.5 / 5.5 =" + call.angka);
        call.pembagian(8, 2, 2);
        System.out.println("pembagian 8 / 2 / 2 =" + call.mat);
        call.pembagian(10.5, 5.5, 2.5);
        System.out.println("pembagian 10.5 / 5.5 / 2.5 =" + call.angka);
        
        //modulus
        call.modulus(10, 3);
        System.out.println("modulus 10 % 3 =" + call.mat);
        call.modulus(20.3, 8.2);
        System.out.println("modulus 20.3 % 8.2 =" + call.angka);
        call.modulus(10, 3, 2);
        System.out.println("modulus 10 % 3 % 2=" + call.mat);
        call.modulus(35.2, 3.5, 2.7);
        System.out.println("modulus 35.2 % 3.5 % 2.7 =" + call.mat);
    }
}

