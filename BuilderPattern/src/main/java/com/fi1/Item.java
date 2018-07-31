package com.fi1;

import com.fi1.packing.Packing;

public interface Item {
    String name();

    Packing packing();

    float price();
}
