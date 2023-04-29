package az.developia.bookshoping.controller;

import az.developia.bookshoping.controller.DAO.BookDAO;
import az.developia.bookshoping.controller.modal.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {
    @Autowired
    private BookDAO bookDAO;
    @GetMapping
    public List<Book> findAll() {
        return bookDAO.findAll();
    }
    @GetMapping("/{id}")
    public Book findById(@PathVariable(name="id") Integer id) {
        return bookDAO.findById(id).get();
    }
}
