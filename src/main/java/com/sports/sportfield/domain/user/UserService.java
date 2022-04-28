package com.sports.sportfield.domain.user;

import com.sports.sportfield.domain.contact.Contact;
import com.sports.sportfield.domain.contact.ContactRepository;
import com.sports.sportfield.domain.contact.ContactService;
import org.springframework.stereotype.Service;

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

    public UserDto addNewUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        Contact contact = user.getContact();
        contactRepository.save(contact);
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

}
