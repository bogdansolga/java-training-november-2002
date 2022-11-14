package com.training.d03.s01.intf;

import com.training.d03.s01.model.AbstractFruit;

public interface AbstractFruitSource {

    @Deprecated // just a warning, to use it with caution --> will no longer be maintained, maybe it will be removed at all
    AbstractFruit getFruitByName(String name);
}
