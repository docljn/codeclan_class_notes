public class Glass<T extends Liquid> {
    private T liquid;

    public String getLiquidTaste(){
        return liquid.taste();
    }

    public <E extends Juice> String getLiquidTaste(E juice){
        return juice.taste();
    }


/*
They must have a type parameter part of the method signature that is marked by a pair of angular brackets ( < and > ) and this part is placed right before the method return type declaration
https://java2blog.com/java-generics-tutorial/#MethodsFunctions_as_Generics

ALSO: Type Parameter Naming Conventions

By convention, type parameter names are single, uppercase letters. This stands in sharp contrast to the variable naming conventions that you already know about, and with good reason: Without this convention, it would be difficult to tell the difference between a type variable and an ordinary class or interface name.

The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
You'll see these names used throughout the Java SE API and the rest of this lesson.
*/


}
