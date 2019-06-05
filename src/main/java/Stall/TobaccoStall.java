package Stall;

import Attraction.Visitor;
import Interfaces.ISecurity;


public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            return true;
        } else {
            return false;
        }
    }
}
