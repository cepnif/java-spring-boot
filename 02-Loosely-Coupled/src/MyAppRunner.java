import services.FullTimeMentor;
import services.MentorAccount;
import services.PartTimeMentor;

public class MyAppRunner {

    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(partTimeMentor);
        mentorAccount.manageMentor();
    }
}
