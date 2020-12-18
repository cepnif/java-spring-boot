public class MentorAccount {
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public MentorAccount(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        this.fullTimeMentor.createAccount();
        this.partTimeMentor.createAccount();
    }
}
