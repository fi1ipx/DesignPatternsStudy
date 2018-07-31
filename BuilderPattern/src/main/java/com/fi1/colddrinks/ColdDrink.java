package com.fi1.colddrinks;

import com.fi1.Item;
import com.fi1.packing.Bottle;
import com.fi1.packing.Packing;

public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
