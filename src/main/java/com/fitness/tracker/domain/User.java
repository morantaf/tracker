package com.fitness.tracker.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;

@Getter
@Setter
@Entity(name = "users")
@Table
@NoArgsConstructor
public class User implements UserDetails {

    @Id
    @SequenceGenerator(name = "user_sequence", allocationSize = 1, sequenceName = "user_sequence")
    @GeneratedValue(generator = "user_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private LocalDate joinDate;

    @Column
    private Float weightGoal;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.joinDate = LocalDate.now();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
