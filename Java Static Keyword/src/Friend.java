public class Friend {
    static int noOfFriends; // Becomes a shared variable between all objects
    String name;
    Friend(String name){
        this.name = name;
        noOfFriends++; // Whenever an object is created, we update the shared variable (static)
    }
}
