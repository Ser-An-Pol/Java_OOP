import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {
    private int index;
    List<StudyGroup> studyGroupList;

    public StreamIterator(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        return (hasNext()) ? studyGroupList.get(index++) : null;
    }
}
