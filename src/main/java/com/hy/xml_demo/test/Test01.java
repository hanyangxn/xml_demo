package com.hy.xml_demo.test;

import java.util.function.BiFunction;

/**
 * @author hy
 * @description:
 * @date 2020/08/18
 */
public class Test01 {
    static BiFunction<String, String, Boolean> fun3;
    public static void main(String[] args) {
        BiFunction<Object, String, Boolean> fun = (v1, v2) -> Boolean.valueOf(v1 + v2);
        Boolean apply = fun.apply("1", "");
        System.out.println(apply);

        BiFunction<String, String, Boolean> fun1 = (v1, v2) -> {
            return v1.equals(v2);
        };
        Boolean apply1 = fun1.apply("1", "1");
        System.out.println(apply1);
        fun3 =Test01::testBi;
        Boolean apply2 = fun3.apply("1", "1");
        System.out.println(apply2);


    }

    public static Boolean testBi(String a, String b) {
        return a.equals(b);
    }
}
