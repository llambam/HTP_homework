package lesson9;

public class Validator {
    private static final int MAX_AGE = 100;
    private static final int MAX_NAME_LENGTH = 20;
    private static final int MAX_VEIGHT = 120;
    private boolean flag;

    public boolean getFlag() {
        return flag;
    }

    public void validatorCheck(User user) throws Exception {

        try {
            if (user.getUserAge() > MAX_AGE) {
                throw new Exception("by max age");
            }
            if (user.getUserName().length() > MAX_NAME_LENGTH) {
                throw new Exception("by name length");
            }
            if (user.getUserVeight() > MAX_VEIGHT) {
                throw new Exception("by max veight");
            }
            flag =false;
        }catch (Exception e){
            flag =true;
            System.out.println("Exception!  "+e.getMessage());

        }

    }
}


