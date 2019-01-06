package lesson9;


public class Main {

    public void userList() throws Exception {

        User[] user = new User[4];
        user[0] = new User("Poulxxxxxxxxxxxxxxxxxxxxxx", "Glen", 55, 89, true);
        user[1] = new User("Davidadssadsada", "Ololosh", 125, 89, true);
        user[2] = new User("Veronica", "Glen", 45, 999, false);
        user[3] = new User("Veronica", "Glen", 45, 15, false);
        Validator validator = new Validator();

        for (int i=0; i<4;i++) {
//            System.out.println("sadasd"+user[i].toString());
            validator.validatorCheck(user[i]);
            if(validator.getFlag()==false) {
                System.out.println(user[i].toString());
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Validator validator = new Validator();
        main.userList();

    }
}
