package Unit;
public class Hw3 {
    public static void main(String[] args) {


        UserRepository userRepository = new UserRepository();
        User user1 = new User("Kate", "pass", true);
        User user2 = new User("Alex", "pass2", false);
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        System.out.println(userRepository.loginDeletedUser(user1));
    }

    // 1
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // 2
    public boolean numberInterval(int n) {
        if (n >= 25 && n < 100) {
            return true;
        }
        if (n < 0) {
            throw new RuntimeException("Число отрицательное");
        } else {
            return false;
        }
    }
}