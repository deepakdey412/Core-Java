public class UserServiceImplement implements UserService {
    @Override
    public String showMessage() {
        return "Hii , how are you ?";
    }

    @Override
    public String showGretting() {
        return "Hello , good morning";
    }

    public static void main(String[] args) {
        // Object creation (reference of interface, object of class)
        UserService userService = new UserServiceImplement();

        // Method calls
        System.out.println(userService.showMessage());
        System.out.println(userService.showGretting());
    }
}