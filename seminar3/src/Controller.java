import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;
    private StreamService streamService;

    public Controller(StudyGroup studyGroup) {
        this.studyGroupService = new StudyGroupService(studyGroup);
    }

    public Controller(Stream stream) {
        this.streamService = new StreamService(stream);
    }

    public Controller(StudyGroup studyGroup, Stream stream) {
        this.studyGroupService = new StudyGroupService(studyGroup);
        this.streamService = new StreamService(stream);
    }

    public void setStudyGroupService(StudyGroup studyGroup) {
        this.studyGroupService = new StudyGroupService(studyGroup);
    }

    public boolean removeStudent(String firstName, String secondName, String lastName) {
        System.out.println("Remove student: " + firstName + " " + secondName + " " + lastName);
        return studyGroupService.removeStudent(firstName, secondName, lastName);
    }

    public List<Student> sortStudentsByAge() {
        System.out.println("Sort students by age:");
        return studyGroupService.sortStudentsByAge();
    }

    public List<Student>  sortStudentsByFirstLastName() {
        System.out.println("Sort students by first and last name:");
        return studyGroupService.sortStudentsByFirstLastName();
    }

    public List<StudyGroup> sortByCountOfGroup() {
        System.out.println("Sort streams by count of groups:");
        return streamService.sortByCountOfGroup();
    }
}
