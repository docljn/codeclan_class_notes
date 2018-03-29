# Introduction to Generics

## Learning Objectives
- Know what generics are
- Understand when we would use generics
- Understand how to make a simple generic class

## Task
As an introduction to generics either:
- watch the following video: [Intro to Generics video](https://www.youtube.com/watch?v=rmF2csiNg14&feature=youtu.be)
- read `generics.md` in the `generics` directory

Answer the following questions:
1. What is one benefit of using generics in Java classes?
  - compile-time checking, rather than run time as you would get with using an interface/superclass and then casting [you don't use casting with generic classes]
  - whatever type you put into the class is the type you get out
  - code is generic i.e. more flexibly usable, and hence more likely to be dry
2. Name an example of a generic class that we have used in Java?
  - ListArray<T>
  - HashMap<T, V>
3. What is the syntax for declaring a generic class?
  - public class ClassName<T>{
      private T instanceVariable;
  }
4. At what point does the generic type get specified?
  - at instantiation
5. Can generic types be of primitive type?
  - no
6. Can a generic class take more than one type parameters?
  - yes: public class ClassName<T, V>{}

## References:
1. https://www.journaldev.com/1663/java-generics-example-method-class-interface
2. https://java2blog.com/java-generics-tutorial/#MethodsFunctions_as_Generics
3. https://www.tutorialspoint.com/java_generics/index.htm
4. https://youtu.be/D5HEshszlPE
