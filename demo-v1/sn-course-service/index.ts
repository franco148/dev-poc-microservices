import CourseResource from "./resources/course.resource";
import { SERVER_PORT } from "./constants/environment";
import router from "./routes/router";

const courseService = new CourseResource();
courseService.app.use('/', router);

courseService.start(() => {
    console.log(`Service is running at port=${SERVER_PORT}`)
});
