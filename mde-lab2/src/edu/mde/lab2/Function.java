package edu.mde.lab2;

import java.text.NumberFormat;

public interface Function {
    double calculate(double x);
    Function derivative();
    String toPrettyString(NumberFormat nf);
}
