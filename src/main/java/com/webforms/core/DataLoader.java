package com.webforms.core;


import com.webforms.model.User;
import com.webforms.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        IntStream.range(0, 5).forEach(i -> {

            User user = User.builder()
                    .age(25)
                    .name("person" + i)
                    .salary(1000)
                    .build();

            userRepository.save(user);

        });

    }
}
