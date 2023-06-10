package com.ashish.lms.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberId;

    @NotEmpty(message = "First name is required")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    private String lastName;

    @NotNull (message = "email cannot be null")
    @NotEmpty (message = "email cannot be empty")
    @Email
    private String email;    
    
    private String mobile;

    @OneToMany(mappedBy = "member")
    private List<Borrow> borrows;
    
}
