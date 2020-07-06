import { Level } from "./level.enum";

export class CourseModel {
    courseId: string;
    name: string;
    level: Level;

    constructor(courseId: string, name: string, level: Level) {
        this.courseId = courseId;
        this.name = name;
        this.level = level;
    }
}