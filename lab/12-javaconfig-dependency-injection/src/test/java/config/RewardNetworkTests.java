package config;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import rewards.RewardNetwork;
import rewards.TestInfrastructureConfig;

import static org.assertj.core.api.Fail.fail;

public class RewardNetworkTests {
    private RewardNetwork network;
    @BeforeEach
    void setUp() throws Exception{
        ApplicationContext context = SpringApplication.run(TestInfrastructureConfig.class);
        context.getBean(RewardNetwork.class);
    }

    void test(){
        fail("not yest");
    }
}
