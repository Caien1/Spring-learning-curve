package com.example.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springSecurity.model.UserPrincipal;
import com.example.springSecurity.model.Users;
import com.example.springSecurity.repo.UserRepo;

@Service
public class MyUserDetailService implements UserDetailsService{
    @Autowired    
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.findByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("User not found");
        }
       return new UserPrincipal(user);
    }
    
}