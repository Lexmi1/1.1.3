package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Sasha", "Strukov", (byte) 21);
        userService.saveUser("Kris", "Rogozina", (byte) 21);
        userService.saveUser("Tanya", "Tselueva", (byte) 45);

        userService.getAllUsers().stream().forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}