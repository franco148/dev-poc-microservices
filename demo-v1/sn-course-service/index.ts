import CourseResource from "./resources/course.resource";
import { SERVER_PORT } from "./constants/environment";

const courseService = new CourseResource();

courseService.start(() => {
    console.log(`Service is running at port=${SERVER_PORT}`)
});
