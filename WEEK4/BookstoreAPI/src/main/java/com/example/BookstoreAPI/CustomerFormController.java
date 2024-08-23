package com.example.BookstoreAPI;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/customers-form")
public class CustomerFormController {

    @Autowired
    private ClassLoaderRepository customerRepository;

    @PostMapping("/register")
    public String registerCustomer(
        @RequestParam("name") String name,
        @RequestParam("email") String email,
        @RequestParam("password") String password,
        RedirectAttributes redirectAttributes
    ) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPassword(password);

        ((Object) customerRepository).save(customer);
        redirectAttributes.addFlashAttribute("message", "Customer registered successfully!");
        return "Customer registered successfully!";
    }
}
