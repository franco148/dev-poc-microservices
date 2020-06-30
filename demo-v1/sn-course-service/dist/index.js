"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const course_resource_1 = __importDefault(require("./resources/course.resource"));
const environment_1 = require("./constants/environment");
const courseService = new course_resource_1.default();
courseService.start(() => {
    console.log(`Service is running at port=${environment_1.SERVER_PORT}`);
});
