package java17features.sealedClasses;

//It is a sealed interface that permits only Rectangle and Square classes to implement it.
//It extends the sealed interface Shape.
public sealed interface Quadrilaterals extends Shape permits Rectangle, Square, Trapezoid {

}
