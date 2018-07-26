package com.pd.bridge;

import java.util.Random;

public class RandomDisplayByBook extends CountDisplay {

    private Random random;

    public RandomDisplayByBook(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}
