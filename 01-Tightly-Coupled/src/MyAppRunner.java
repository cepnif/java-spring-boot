public class MyAppRunner {

    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor,partTimeMentor);
        mentor.fullTimeMentor.createAccount();
        mentor.partTimeMentor.createAccount();
    }
}
