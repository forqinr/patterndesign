package com.pd.factorymethod.idcard;

import com.pd.factorymethod.framework.Factory;
import com.pd.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class IDCardFactory extends Factory {
    //    private List owners = new ArrayList();

    private HashMap database = new HashMap();
    private int     serial   = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(new Integer(card.getNumber()), card);
    }

    //    public List getOwners() {
    //        return owners;
    //    }


    public HashMap getDatabase() {
        return database;
    }
}
