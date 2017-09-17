package edu.cmu.mis.iccfb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.mis.iccfb.model.Author;
import edu.cmu.mis.iccfb.model.Quote;
import edu.cmu.mis.iccfb.service.AuthorService;

@RestController
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;
    
    @RequestMapping("/api/author/{id}")
    public Author getAuthor(@PathVariable(value="id") Long id) {
        return this.authorService.findOne(id);
    }

}
