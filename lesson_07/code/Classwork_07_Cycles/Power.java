package Classwork_07_Cycles;

//Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power {

    public static void main(String[] args) {

        int pow = (int) Math.pow(3, 10); // кастинг - это п реобразование типов в данном случае double в int
        System.out.println(pow);

        // начальные значения

        int count = 0; //параметр цикла
        int res = 1;

        while (count < 10) {

            res = res *3; // возведение в степень
            count ++; // изменения параметра цикла
            System.out.println(res + " = 3 in power " + count);

        } // end of while


    } // end of main


} // end of class
