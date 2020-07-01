package com.fral.share.knowledge.student.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient("COURSE-SERVICE")
public interface CoursesFeignClient {
    
}