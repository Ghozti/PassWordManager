package passwordManager.utils;

public class CredentialsValidator {

    public boolean validateName(String correctName, String actualName){
        return correctName.equals(actualName);
    }

    public boolean validatePass(String correctPass, String actualPass){
        return correctPass.equals(correctPass);
    }
}
