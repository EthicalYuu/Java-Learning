public class Main {
    public static void main(String[] args) {

        // Static = modifier, a single copy of a variable/method is created and shared.
        //          the class owns the static member

        Friend friend1 = new Friend("Yussif");
        Friend friend2 = new Friend("Musa");
        Friend friend3 = new Friend("Omar");
        Friend friend4 = new Friend("Abdalla");

        System.out.println(Friend.noOfFriends);
    }
}