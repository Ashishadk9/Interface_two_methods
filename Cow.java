
/**
 * Write a description of class Cow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Cow implements Animal, Printable
{
    public void eat(){
        System.out.println("The cow is eating grass.");
    }
    public void walk(){
        System.out.println("The cow is walking in the field.");
    }
    public void display(){
        System.out.println("The is a cow.");
    }
}
