import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroupList;

    public Stream() {
        studyGroupList = new ArrayList<>();
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        studyGroupList.add(studyGroup);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(studyGroupList);
    }
}
