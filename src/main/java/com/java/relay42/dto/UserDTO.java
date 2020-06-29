package com.java.relay42.dto;

import com.java.relay42.constants.IotConstants;
import com.java.relay42.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * A DTO representing a user, with his authorities.
 */
@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {

    public static final int PASSWORD_MIN_LENGTH = 4;

    public static final int PASSWORD_MAX_LENGTH = 100;
    private static final long serialVersionUID = -7625051385555824365L;

    private String id;

    @NotBlank
    @Pattern(regexp = IotConstants.LOGIN_REGEX)
    @Size(min = 1, max = 50)
    private String login;

    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @Email
    @Size(min = 5, max = 254)
    private String email;

    private boolean activated = false;

    @Size(min = 2, max = 10)
    private String langKey;

    private Set<String> authorities;


    public UserDTO(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.langKey = user.getLangKey();
        this.authorities = user.getAuthorities();
    }
}
