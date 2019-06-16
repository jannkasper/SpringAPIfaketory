package spring.api.services;

import spring.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers (Integer limit);
}
