package za.ac.tut.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-10T23:43:59")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Long> studentId;
    public static volatile SingularAttribute<User, String> role;
    public static volatile ListAttribute<User, Book> books;
    public static volatile SingularAttribute<User, String> name;

}