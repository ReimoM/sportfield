package com.sports.sportfield.domain.user;

import com.sports.sportfield.domain.contact.Contact;
import com.sports.sportfield.domain.contact.ContactRepository;
import com.sports.sportfield.domain.contact.ContactService;
import com.sports.sportfield.domain.role.Role;
import com.sports.sportfield.service.login.LogInRequest;
import com.sports.sportfield.validation.ValidationService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ContactService contactService;

    @Resource
    private ContactRepository contactRepository;

    @Resource
    private ValidationService validationService;

    public UserDto addNewUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        Contact contact = user.getContact();
        contactRepository.save(contact);
        boolean userNameExists = userRepository.existsByUsername(userDto.getUsername());
        validationService.userNameExists(userDto.getUsername(), userNameExists);
        userRepository.save(user);
        return userMapper.toDto(user);
    }

    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.toDtos(users);
    }

    public UserDto findUserById(Integer id) {
        User user = userRepository.getById(id);
        return userMapper.toDto(user);
    }

    public void deleteUserById(Integer id) {
        User user = userRepository.getById(id);
        Contact contact = user.getContact();
        userRepository.delete(user);
      contactRepository.delete(contact);

    }

    public User getValidUser(LogInRequest request) {
        Optional <User> user = userRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
        validationService.userExists(user);
        return user.get();
    }

    public User getUserById(Integer userId) {
        return userRepository.getById(userId);
    }
}
