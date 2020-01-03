import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestUser {

    List<User> list = Arrays.asList(new User(1,3),new User(2,4),
            new User(3,6),new User(2,3), new User(2,10));

    @Test
    public void test1(){
        list.stream().filter(e -> {
            System.out.println("短路");
            return e.getGongzi()>5;
        }).limit(1)
                .forEach(System.out::println);
    }
    @Test
    public void test2(){
        List<Integer> list =  Arrays.asList(1,2,3,4,5);
        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
    }
    @Test
    public void test3(){
        Optional<Integer> reduce = list.stream().map(User::getGongzi).reduce(Integer::sum);
        System.out.println(reduce.get());
    }

    @Test
    public void test4(){
        LocalDateTime ls = LocalDateTime.now();
        System.out.println(ls);
        Instant ins = Instant.now();
        System.out.println(ins);

    }
}
