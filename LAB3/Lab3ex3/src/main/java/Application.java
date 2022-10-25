import config.ProjectConfig;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user = User.builder().name("Maria").build();

        User user2 = User.builder().name("Corina").information("Admin user").build();

        userService.addUser(user);
        userService.addUser(user2);
        userService.getUsers();

        // userService.addUser("Andrei", "20");

        //userService.logUser();


    }

}

