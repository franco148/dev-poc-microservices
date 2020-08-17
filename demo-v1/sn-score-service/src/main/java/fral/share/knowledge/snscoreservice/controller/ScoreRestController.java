package fral.share.knowledge.snscoreservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fral.share.knowledge.snscoreservice.domain.Score;
import fral.share.knowledge.snscoreservice.service.ScoreService;

@RequestMapping("/scores")
@RestController
public class ScoreRestController {

    private final ScoreService scoreService;


    public ScoreRestController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }


    @GetMapping
    public ResponseEntity<List<Score>> getAllScores() {
        return ResponseEntity.ok(scoreService.getAllScores());
    }
}