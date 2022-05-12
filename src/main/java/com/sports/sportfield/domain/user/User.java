package com.sports.sportfield.domain.user;

import com.sports.sportfield.domain.contact.Contact;
import com.sports.sportfield.domain.role.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;

    @Column(name = "username", nullable = false, length = 250)
    private String username;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

}