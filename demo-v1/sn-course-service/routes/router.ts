import { Router, Request, Response } from "express";
import * as uuid from "uuid";

import CourseService from "../services/couse.service";
import { CourseModel } from "../models/course.model";

const router = Router();
const courseService = new CourseService();

router.get('/courses', (req: Request, res: Response)=> {
    // res.json({
    //     ok: true,
    //     courses: courseService.getCourses()
    // });
    res.json(courseService.getCourses());
});

router.post('/courses', (req: Request, res: Response) => {
    const newCourseId = uuid.v4();
    let newCourse = new CourseModel(newCourseId, req.body.name, req.body.level);
    courseService.addNewCourse(newCourse);
    res.json(newCourse);
});

export default router;