package com.example.demo.service;

import com.example.demo.model.Store;
import com.example.demo.model.User;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.repository.StoreRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// 기존 서비스와 분리 시킬 필요는 딱히 없음
@Service
@Primary
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByEmail(username);
    }

    public User createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Store registerStore(Store store, UserDetails userDetails){
        User user = userRepository.findByEmail(userDetails.getUsername());
        store.setUserId(user.get_id());
        store.setWalletAddress(user.getWalletAddress());
        return storeRepository.save(store);
    }

    public Store getUserStore(UserDetails userDetails){
        User user = userRepository.findByEmail(userDetails.getUsername());

        return storeRepository.findByUserId(user.get_id());
    }

}
