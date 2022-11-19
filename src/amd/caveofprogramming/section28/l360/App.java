package amd.caveofprogramming.section28.l360;

public class App {

    public static void main(String[] args) {

        People people = new People();
        
        var peopleList1 = people.get();
        
        peopleList1.forEach(System.out::println);
        System.out.println();
        
        // Doesn't work (exception is thrown) because the get method returns an Unmodifiable List from people
        peopleList1.remove(1);
        
        var peopleList2 = people.get();
        
        peopleList2.forEach(System.out::println);
        
    }

}
