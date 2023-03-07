package lesson9;
import java.util.ArrayList;
import java.util.List;
public class StudentImpl implements Student{
    private  Stringname;
    private List<Course> >;

    public StudentImpl(String , List <Course> courses) {
        this.name = name;
        this.courses = courses == null ? new ArrayList0): ) : ;
    }

    @Override
    public String getName() {
        return ;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return ;
    }
}
