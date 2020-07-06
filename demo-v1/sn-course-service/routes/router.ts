import { Router, Request, Response } from "express";
import CourseService from "../services/couse.service";

const router = Router();
const courseService = new CourseService();

router.get('/courses', (req: Request, res: Response)=> {
    res.json({
        ok: true,
        courses: courseService.getCourses()
    });
});

export default router;