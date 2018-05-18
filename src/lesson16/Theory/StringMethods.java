package lesson16.Theory;

import java.util.Arrays;

/**
 * Created by Ruslan on 27.04.2018.
 */
public class StringMethods {
    public static void main(String[] args) {

        String test = "someStringExample";

        System.out.println(test.isEmpty()); //проверяет, пустой ли Стринг

        System.out.println("".isEmpty()); //это пустой Стринг

        System.out.println(test.length()); //Длина Стринга

        System.out.println(test.charAt(2)); //Находит символ в Стринге под указанным индексом

        String res = test.replace("me","T"); //заменяет один Стринг на второй
        System.out.println(res); //результат изменится, если присвоим результату пред.операции новую переменную

        System.out.println(test.replaceAll("me","T")); //заменяет Регекс на Стринг

        //String regex = "{a-Z}";
        System.out.println(test);
        System.out.println(test.contains("mes")); //Проверяет, содержит ли Стринг входящий параметр метода
                                                    //важно, большая или маленькая ли буква
        System.out.println(test);
        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split(" "))); //Делит Стринг на массив подСтригов, разделенных входящим параметром

        System.out.println(" test a". trim()); //обрезает пробелы в начале и в конце Стринга

        System.out.println(phrase.substring(5)); //разделяет Стринг на подСтринг, который начинается на 5-й
                                                    //(в данном случае) позицию - то есть с номера индекса
        System.out.println(phrase.substring(5,10).trim());//с пятой позиции включительно по 8-ю невлючительно


        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        test.equals("eeee");
        test.intern();

        test.getBytes();
    }
}
