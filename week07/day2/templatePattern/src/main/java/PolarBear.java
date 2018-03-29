public class PolarBear extends Bear{

    public void gatherFood(){
        System.out.println("Gone fishing");
    }

    @Override
    // this is an annotation to highlight that the method has been overridden
    public void eat(){
        System.out.println("Munching in the snow");
    }

}
