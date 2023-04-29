package az.developia.bookshoping.controller.modal;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){

    }
}
