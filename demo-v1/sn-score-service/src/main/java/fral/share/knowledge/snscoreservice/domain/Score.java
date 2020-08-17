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

    public float getScore() {
        return scoreValue;
    }

    public void setScore(float score) {
        this.scoreValue = score;
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