
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Cow cow = new Cow();
        cow.eat();// Call metnods from animal interface
        cow.walk();
        cow.display();// Call method from printable interface
    }
}
