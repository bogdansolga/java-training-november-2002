package com.training.d04.s01;

public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convertInput(String s) {
        return Integer.parseInt(s);
    }

    @Override
    public String convertOutput(Integer integer) {
        return integer.toString();
    }
}
