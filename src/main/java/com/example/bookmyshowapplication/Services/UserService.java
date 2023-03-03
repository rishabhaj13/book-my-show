package com.example.bookmyshowapplication.Services;

import EntryDTOs.UserEntryDto;
import com.example.bookmyshowapplication.Entities.UserEntity;
import com.example.bookmyshowapplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto){

        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).build();

        userRepository.save(userEntity);


    }
}
