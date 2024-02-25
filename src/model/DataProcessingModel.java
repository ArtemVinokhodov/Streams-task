package model;

import entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class DataProcessingModel {
    public void processingData(List<User> list) {
 List<User> filteredUsers = list.stream()
         .filter(str -> str.getMail().contains("123"))
         .collect(Collectors.toList());
        filteredUsers.forEach(System.out::println);
    }
}
