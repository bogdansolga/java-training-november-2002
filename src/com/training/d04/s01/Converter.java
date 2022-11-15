package com.training.d04.s01;

public interface Converter<Input, Output> {

    Output convertInput(Input input);

    Input convertOutput(Output output);
}
