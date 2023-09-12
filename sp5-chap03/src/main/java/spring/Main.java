package spring;

public class Main {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberRegisterService reqSvc = new MemberRegisterService(memberDao);
        ChangePasswordService pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
        // reqSvc와 pwdSvc를 사용하는 코드..

    }
}