package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-10T23:43:59")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Date> datePosted;
    public static volatile SingularAttribute<Book, User> user;
    public static volatile SingularAttribute<Book, String> faculty;
    public static volatile SingularAttribute<Book, String> status;

}