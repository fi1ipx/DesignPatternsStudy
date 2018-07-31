package com.fi1.burgers;

import com.fi1.packing.Packing;
import com.fi1.packing.Wrapper;
import com.fi1.Item;

public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
