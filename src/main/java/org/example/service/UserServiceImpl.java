package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public UserDto save(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        UserEntity saved = userRepository.save(userEntity);
        userDto.setId(saved.getId());
        return userDto;
    }
}
