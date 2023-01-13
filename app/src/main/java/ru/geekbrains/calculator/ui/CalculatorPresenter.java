package ru.geekbrains.calculator.ui;

import ru.geekbrains.calculator.model.Calculator;

public class CalculatorPresenter {
    
    private CalculatorView view;
    private Calculator calculator;


    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }


    public void keyNinePressed() {
    }

    public void onDigitPressed(int digit) {
    }
}

