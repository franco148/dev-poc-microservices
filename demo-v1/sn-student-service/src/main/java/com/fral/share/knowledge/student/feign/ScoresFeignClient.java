package com.fral.share.knowledge.student.feign;

import java.util.List;
import java.util.UUID;

import com.fral.share.knowledge.student.domain.Score;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient("SCORE-SERVICE")
public interface ScoresFeignClient {
    
    @RequestMapping
    (
        value = "/scores/{studentId}",
        method = RequestMethod.GET,
        consumes = { "application/json" },
        produces = { "application/json" }
    )
    List<Score> getStudentScores(@PathVariable("studentId") UUID studentId);
}