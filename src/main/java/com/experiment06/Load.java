package com.experiment06;

import com.experiment06.exceptions.OverLoadException;

public class Load {
    public static Ship loadContainers(Ship ship,Container[] containers) throws OverLoadException{
        double totalWeight = 0;
        for (Container container : containers){
            totalWeight = totalWeight+container.getWeight();
        }
        if (totalWeight > ship.getLoad()){
            throw new OverLoadException(ship.getId(),ship.getName(),totalWeight - ship.getLoad());
        }
        for (Container container : containers){
            ship.addContainers(container);
        }
        return ship;
    }
}
