package library.users;

public class Member extends User {
    private String membershipType;

    public Member(String name, int id, String membershipType) {
        super(name, id);
        this.membershipType = membershipType;
    }

    public Member() {
        this("Member", 1, "Basic");
    }

    @Override
    public void accessLibrary() {
        System.out.println("Member accessing the library.");
    }

    public String getMembershipType() {
        return membershipType;
    }
}
