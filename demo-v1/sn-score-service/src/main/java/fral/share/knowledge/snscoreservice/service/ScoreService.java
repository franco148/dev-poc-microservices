package fral.share.knowledge.snscoreservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import fral.share.knowledge.snscoreservice.domain.Score;

public class ScoreService {
    
    private List<Score> scoresCollection;

    public ScoreService() {
        scoresCollection = new ArrayList<>();
        initializeScoresInformation();
    }

    private void initializeScoresInformation() {
        //
        UUID francoId = UUID.fromString("4bdf3e86-e02a-11ea-87d0-0242ac130003");
        UUID juanId = UUID.fromString("4bdf4174-e02a-11ea-87d0-0242ac130003");
        UUID claudiaId = UUID.fromString("4bdf4610-e02a-11ea-87d0-0242ac130003");

        UUID calculoId = UUID.fromString("1ffe21b4-bf2e-11ea-b3de-0242ac130004");
        UUID programmingId = UUID.fromString("1ffe27cc-bf2e-11ea-b3de-0242ac130004");
        UUID englishId = UUID.fromString("1ffe292a-bf2e-11ea-b3de-0242ac130004");
        UUID artificialIntelligenceId = UUID.fromString("1ffe2a06-bf2e-11ea-b3de-0242ac130004");
        UUID physicsId = UUID.fromString("1ffe2b46-bf2e-11ea-b3de-0242ac130004");

        UUID faCalculoScoreId = UUID.fromString("3f6c8308-e029-11ea-87d0-0242ac130003");
        UUID faProgramacionScoreId = UUID.fromString("3f6c83c6-e029-11ea-87d0-0242ac130003");
        UUID faInglesScoreId = UUID.fromString("3f6c8484-e029-11ea-87d0-0242ac130003");
        UUID faArtificialIntelligenceScoreId = UUID.fromString("3f6c8542-e029-11ea-87d0-0242ac130003");
        
        UUID juCalculoScoreId = UUID.fromString("3f6c860a-e029-11ea-87d0-0242ac130003");
        UUID juFisicaScoreId = UUID.fromString("3f6c86c8-e029-11ea-87d0-0242ac130003");

        UUID clProgramacionScoreId = UUID.fromString("3f6c8786-e029-11ea-87d0-0242ac130003");
        UUID clInglesScoreId = UUID.fromString("4bdf522c-e02a-11ea-87d0-0242ac130003");

        // STUDENT: Franco
        Score faCalculoScore = new Score();
        faCalculoScore.setScoreId(faCalculoScoreId);
        faCalculoScore.setScoreValue(80);
        faCalculoScore.setCourseId(calculoId);
        faCalculoScore.setStudentId(francoId);
        scoresCollection.add(faCalculoScore);

        Score faProgramacionScore = new Score();
        faProgramacionScore.setScoreId(faProgramacionScoreId);
        faProgramacionScore.setScoreValue(100);
        faProgramacionScore.setCourseId(programmingId);
        faProgramacionScore.setStudentId(francoId);
        scoresCollection.add(faProgramacionScore);

        Score faInglesScore = new Score();
        faInglesScore.setScoreId(faInglesScoreId);
        faInglesScore.setScoreValue(70);
        faInglesScore.setCourseId(englishId);
        faInglesScore.setStudentId(francoId);
        scoresCollection.add(faInglesScore);

        Score faArtIntelljScore = new Score();
        faArtIntelljScore.setScoreId(faArtificialIntelligenceScoreId);
        faArtIntelljScore.setScoreValue(70);
        faArtIntelljScore.setCourseId(artificialIntelligenceId);
        faArtIntelljScore.setStudentId(francoId);
        scoresCollection.add(faArtIntelljScore);

        // STUDENT: Juan
        Score juCalculojScore = new Score();
        juCalculojScore.setScoreId(juCalculoScoreId);
        juCalculojScore.setScoreValue(70);
        juCalculojScore.setCourseId(calculoId);
        juCalculojScore.setStudentId(juanId);
        scoresCollection.add(juCalculojScore);

        Score juFisicaScore = new Score();
        juFisicaScore.setScoreId(juFisicaScoreId);
        juFisicaScore.setScoreValue(80);
        juFisicaScore.setCourseId(physicsId);
        juFisicaScore.setStudentId(juanId);
        scoresCollection.add(juFisicaScore);

        // STUDENT: Claudia
        Score clProgrammingScore = new Score();
        clProgrammingScore.setScoreId(clProgramacionScoreId);
        clProgrammingScore.setScoreValue(80);
        clProgrammingScore.setCourseId(programmingId);
        clProgrammingScore.setStudentId(claudiaId);
        scoresCollection.add(clProgrammingScore);

        Score clEnglishScore = new Score();
        clEnglishScore.setScoreId(clInglesScoreId);
        clEnglishScore.setScoreValue(90);
        clEnglishScore.setCourseId(englishId);
        clEnglishScore.setStudentId(claudiaId);
        scoresCollection.add(clEnglishScore);
    }
}