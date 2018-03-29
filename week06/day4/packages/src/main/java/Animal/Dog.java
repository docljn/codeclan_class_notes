package Animal;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Dog {
    public String name;  //public
    int age;             //package-private (default, no modifier)
//    means we have access to a getter method without creating one
//    public instance variables are v. unusual as it means any class can change the name
//    avoid!

    public void bark() {
        System.out.print("Bark!");
    }

    protected void wagTail(){
        System.out.print("WiggleWaggle");
    }
}
