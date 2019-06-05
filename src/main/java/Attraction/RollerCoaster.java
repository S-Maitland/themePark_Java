package Attraction;

import Interfaces.ISecurity;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }

}
