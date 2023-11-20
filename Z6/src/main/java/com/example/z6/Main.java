
interface AuthenticationMethod {
    boolean authenticate();
}


class PasswordAuthentication implements AuthenticationMethod {
    @Override
    public boolean authenticate() {

        System.out.println("Аутентификация по паролю");

        return true;
    }
}


class FingerprintAuthentication implements AuthenticationMethod {
    @Override
    public boolean authenticate() {

        System.out.println("Аутентификация по отпечатку пальца");

        return true;
    }
}


class OAuthAuthentication implements AuthenticationMethod {
    @Override
    public boolean authenticate() {

        System.out.println("Аутентификация по OAuth");

        return true;
    }
}


class UserAuthenticator {
    private AuthenticationMethod authenticationMethod;

    public UserAuthenticator(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public boolean authenticateUser() {

        System.out.println("Начало процесса аутентификации");


        boolean result = authenticationMethod.authenticate();

        System.out.println("Завершение процесса аутентификации");

        return result;
    }
}


public class Main {
    public static void main(String[] args) {

        AuthenticationMethod passwordAuth = new PasswordAuthentication();
        AuthenticationMethod fingerprintAuth = new FingerprintAuthentication();
        AuthenticationMethod oauthAuth = new OAuthAuthentication();


        UserAuthenticator userAuthenticator1 = new UserAuthenticator(passwordAuth);
        userAuthenticator1.authenticateUser();

        UserAuthenticator userAuthenticator2 = new UserAuthenticator(fingerprintAuth);
        userAuthenticator2.authenticateUser();

        UserAuthenticator userAuthenticator3 = new UserAuthenticator(oauthAuth);
        userAuthenticator3.authenticateUser();
    }
}
