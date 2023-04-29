package az.developia.bookshoping.controller.DAO;

import az.developia.bookshoping.controller.modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book, Integer> {
}
