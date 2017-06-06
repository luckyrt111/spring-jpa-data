package jpa;

import jpa.config.SpringConfig;
import jpa.entity.BookEntity;
import jpa.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by DELL on 06/06/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);


        BookRepository repository = context.getBean("bookRepository",BookRepository.class);
        //Them vao database(insert)
//        BookEntity bookEntity = new BookEntity();
//        bookEntity.setAuthor("Phan");
//        bookEntity.setName("Ho");
//        bookEntity.setCatagory("Qn");
//        repository.save(bookEntity);

        //Sua(tuong ung cau lenh update)
//        BookEntity bookEntity = repository.findOne(1);
//        bookEntity.setAuthor("Phuoc");
//        repository.save(bookEntity);

        //xoa
        repository.deleteAll();

    }

}
