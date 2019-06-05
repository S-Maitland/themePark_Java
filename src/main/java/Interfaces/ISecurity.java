package Interfaces;

import Attraction.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);

}
