package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/girl")
public class GirlController  {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @RequestMapping("/getAllGirl")
    public List<Girl> getAllGirl() {
        return girlRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Girl findGirl(@PathVariable Integer id) {
        return girlRepository.findOne(id);
    }

    @RequestMapping("/hi")

    public String say(Model model) {
        model.addAttribute("name", "lantx");
        return "index";
    }
}
