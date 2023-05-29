package iheritance;

public class JobRegistration {

    public static void main(String[] args) {

        JobApplication jobApplication = new JobApplication("CHIMEZIE","UGOCHI", 23);
        jobApplication.setGender("F");
        jobApplication.setJobTitle("Software Engineer");
        jobApplication.setQualification("B.Sc");


        System.out.println(jobApplication);
    }
}
