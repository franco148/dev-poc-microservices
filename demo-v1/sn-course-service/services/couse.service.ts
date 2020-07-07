import { CourseModel } from "../models/course.model";
import { Level } from "../models/level.enum";

export default class CourseService {

    private coursesList: CourseModel[] = [];

    constructor() {
        this.initializeCoursesInformation();
    }


    getCourses() {
        return this.coursesList;
    }

    addNewCourse(course: CourseModel) {
        this.coursesList.push(course);
    }


    private initializeCoursesInformation() {
        //
        const calculoId = '1ffe21b4-bf2e-11ea-b3de-0242ac130004';
        const programmingId = '1ffe27cc-bf2e-11ea-b3de-0242ac130004';
        const englishId = '1ffe292a-bf2e-11ea-b3de-0242ac130004';
        const artificialIntelligenceId = '1ffe2a06-bf2e-11ea-b3de-0242ac130004';
        const physicsId = '1ffe2b46-bf2e-11ea-b3de-0242ac130004';

        //
        let calculoCourse = new CourseModel(calculoId, 'Calculo', Level.FIRST_YEAR);
        let programmingCourse = new CourseModel(programmingId, 'Programming', Level.SECOND_YEAR);
        let englishCourse = new CourseModel(englishId, 'English', Level.THIRD_YEAR);
        let artificialIntelligenceCourse = new CourseModel(artificialIntelligenceId, 'Artificial Intelligence', Level.FIFTH_YEAR);
        let physicsCourse = new CourseModel(physicsId, 'Physics', Level.SECOND_YEAR);

        //
        this.coursesList.push(calculoCourse);
        this.coursesList.push(programmingCourse);
        this.coursesList.push(englishCourse);
        this.coursesList.push(artificialIntelligenceCourse);
        this.coursesList.push(physicsCourse);
    }
}