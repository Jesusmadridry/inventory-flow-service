package inv;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class InventoryFlowApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(InventoryFlowApplication.class);
        application.addListeners(new ApplicationPidFileWriter("inventory-flow.pid"));
        application.run(args);
    }
}
