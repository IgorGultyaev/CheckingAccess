package com.company;

import java.util.Scanner;

public class Main {

    public static User[] getUsers() {
        User[] users = new User[5];
        users[0] = new User("Jhon", "jhon@mail.ru", "jhon24", 24);
        users[1] = new User("Jack", "jack@list.ru", "pass27", 27);
        users[2] = new User("Jacob", "jacob@bk.ru", "pass33", 33);
        users[3] = new User("Jessica", "jhon@internet.ru", "pass17", 17);
        users[4] = new User("James", "jhon@inbox.ru", "pass18", 18);
        return users;
    }

    public static User getUserByLoginAndPassword(String login, String password, User[] users){
        Boolean userFound = false;
        int idFound=0;
        for (int findId = 0; findId < users.length; findId++){
            if ((users[findId].getLogin().equals(login)) && (users[findId].getPassword().equals(password))) {
                idFound = findId;
                userFound = true;
            }
        }
        if(!userFound) {
            throw new UserNotFoundException(login);
        }

            return users[idFound];
    }

    public static void validateUser(User user) throws AccessDeniedException{
        if (user.getAge()<18) {
            throw new AccessDeniedException("Доступ к сервису невозможен, контент 18+");
        }
    }

    public static void main(String[] args) throws UserNotFoundException ,AccessDeniedException {

        User[] users = getUsers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите логин: ");
        String pass = scanner.nextLine();


        try {
            User user = getUserByLoginAndPassword(login, pass, users);
            validateUser(user);
            System.out.println("Досту предоставлен!");
        } catch (UserNotFoundException RuntimeException){
            System.out.println("Нет доступа");
        } catch (AccessDeniedException RuntimeException){
            System.out.println("Нет доступа, контент 18+");
        } finally {
            scanner.close();
        }





    }
}
