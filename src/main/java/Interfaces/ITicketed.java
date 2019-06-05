package Interfaces;

import Attraction.Visitor;

public interface ITicketed {

    double defaultPrice();
    double priceFor(Visitor visitor);
}
