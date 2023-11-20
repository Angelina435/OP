package com.example.z5;

// Интерфейс для методов аутентификации
interface AuthenticationMethod {
    boolean authenticate();
}

// Реализация метода аутентификации по паролю
class PasswordAuthentication implements AuthenticationMethod {
    @Override
    public boolean authenticate() {
        // Логика аутентификации по паролю
        System.out.println("Аутентификация по паролю");
        // Здесь может быть реализация проверки пароля
        return true; // Заглушка, замените на реальную логику
    }
}

// Реализация метода аутентификации по отпечатку пальца
class FingerprintAuthentication implements AuthenticationMethod {
    @Override
    public boolean authenticate() {
        // Логика аутентификации по отпечатку пальца
        System.out.println("Аутентификация по отпечатку пальца");
        // Здесь может быть реализация проверки отпечатка пальца
        return true; // Заглушка, замените на реальную логику
    }
}

// Реализация метода аутентификации по OAuth
class OAuthAuthentication implements AuthenticationMethod {
    @Override
    public boolean authenticate() {
        // Логика аутентификации по OAuth
        System.out.println("Аутентификация по OAuth");
        // Здесь может быть реализация проверки через OAuth
        return true; // Заглушка, замените на реальную логику
    }
}

// Класс, использующий шаблонный метод для аутентификации
class UserAuthenticator {
    private AuthenticationMethod authenticationMethod;

    public UserAuthenticator(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public boolean authenticateUser() {
        // Логика общего шаблонного метода
        // Может включать в себя дополнительные шаги, такие как логирование, проверки и т.д.
        System.out.println("Начало процесса аутентификации");
        
        // Вызываем метод конкретного типа аутентификации
        boolean result = authenticationMethod.authenticate();

        System.out.println("Завершение процесса аутентификации");

        return result;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создаем объекты для разных методов аутентификации
        AuthenticationMethod passwordAuth = new PasswordAuthentication();
        AuthenticationMethod fingerprintAuth = new FingerprintAuthentication();
        AuthenticationMethod oauthAuth = new OAuthAuthentication();

        // Пример использования для каждого метода
        UserAuthenticator userAuthenticator1 = new UserAuthenticator(passwordAuth);
        userAuthenticator1.authenticateUser();

        UserAuthenticator userAuthenticator2 = new UserAuthenticator(fingerprintAuth);
        userAuthenticator2.authenticateUser();

        UserAuthenticator userAuthenticator3 = new UserAuthenticator(oauthAuth);
        userAuthenticator3.authenticateUser();
    }
}
