package spring.intro.model;

public class UserModel {
    private String firstName;
    private String lastName;
    private Integer membershipId;
    private String creationTime;

    // for json post requests
    public UserModel() {
    }

    public UserModel(String firstName, String lastName, Integer membershipId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipId = membershipId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId){
        this.membershipId = membershipId;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime){
        this.creationTime = creationTime;
    }
}
