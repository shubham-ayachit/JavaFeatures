package java17features.sealedClasses;


//It is a sealed interface that permits only Circle class and Quadrilaterals interface to implement it.
//The permits clause specifies the classes that are allowed to implement the interface.
public sealed interface Shape permits Circle, Quadrilaterals {

    //Abstract method to calculate the area of the shape.
    double area();

}
