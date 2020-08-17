package fral.share.knowledge.snscoreservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fral.share.knowledge.snscoreservice.domain.Score;

@RequestMapping("/scores")
@RestController
public class ScoreRestController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world from Score microservice POC");
    }
}