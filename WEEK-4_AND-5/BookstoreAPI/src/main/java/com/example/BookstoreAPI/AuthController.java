package com.example.BookstoreAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestParam String username, @RequestParam String password) {
        // For simplicity, assuming credentials are correct
        String token = jwtUtil.generateToken(username);
        return ResponseEntity.ok(token);
    }
}
