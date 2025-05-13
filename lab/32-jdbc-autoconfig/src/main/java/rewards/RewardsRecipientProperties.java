package rewards;

import org.springframework.boot.context.properties.ConfigurationProperties;

// TODO-06 : Capture properties into a class using @ConfigurationProperties
// - Note that application.properties file already contains the following properties
//
//    rewards.recipient.name=John Doe
//    rewards.recipient.age=10
//    rewards.recipient.gender=Male
//    rewards.recipient.hobby=Tennis
//
// - Annotate this class with @ConfigurationProperties
//   with prefix attribute set to a proper value
// - Create fields (along with needed getters/setters) that reflect the
//   properties above in the RewardsRecipientProperties class
// - Use one of the following 3 schemes to enable @ConfigurationProperties
//   (1) Add @EnableConfigurationProperties(RewardsRecipientProperties.class)
//       to the RewardsApplication class
//   (2) Add @ConfigurationPropertiesScan to RewardsApplication class or
//   (3) Annotate this class with @Component
// - Implement a new command line runner that displays the name of the rewards
//   recipient when the application gets started
@ConfigurationProperties(prefix="rewards.recipient")
public class RewardsRecipientProperties {
    private String name;
    private String age;
    private String gender;
    private String hobby;

    public RewardsRecipientProperties() {}

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getAge(){
        return this.age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setHobby(String hobby){
        this.hobby=hobby;
    }
    public String getHobby(){
        return hobby;
    }
}
