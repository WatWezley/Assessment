package iheritance;

public class JobApplication extends Person{

    private String jobTitle;
    private String qualification;

    private String gender;


    public JobApplication(String lastName, String firstName, int age) {
        super(lastName, firstName, age);
        this.gender = gender;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "JobApplication: " +
                "firstName= '" + super.getFirstName() + '\'' +
                "lastName= '" + super.getLastName() + '\'' +
                "Age= '" + super.getAge() + '\'' +
                " gender='" + gender + '\'' +
                " jobTitle='" + jobTitle + '\'' +
                " qualification='" + qualification + '\'' +
                " gender='" + gender + '\'' +
                '}';
    }
}
