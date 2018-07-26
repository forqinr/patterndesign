package com.pd.bridge;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        long i = Math.round(Math.random() * times);
        for (int j = 0; j < i; j++) {
            print();
        }
        close();
    }
}
