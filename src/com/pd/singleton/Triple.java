package com.pd.singleton;

public class Triple {

    private static Triple t0 = new Triple();
    private static Triple t1 = new Triple();
    private static Triple t2 = new Triple();

    private Triple() {
    }

    public static Triple getInstance(int i) throws Exception {
        if (i == 0)
            return t0;
        else if (i == 1)
            return t1;
        else if (i == 2)
            return t2;
        else
            throw new Exception();
    }

}
