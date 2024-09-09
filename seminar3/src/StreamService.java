import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public List<StudyGroup> sortByCountOfGroup() {
        List<StudyGroup> studyGroupList = new ArrayList<>(stream.getStudyGroupList());
        studyGroupList.sort(new StreamComparator());
        return studyGroupList;
    }
}
