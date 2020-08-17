package fral.share.knowledge.snscoreservice.domain;

import java.util.UUID;

public class Score {
    
    private UUID scoreId;
    private float scoreValue;
    private UUID courseId;
    private UUID studentId;


    public UUID getScoreId() {
        return scoreId;
    }

    public void setScoreId(UUID scoreId) {
        this.scoreId = scoreId;
    }

    public float getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(float scoreValue) {
        this.scoreValue = scoreValue;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }
}