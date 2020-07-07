import express from 'express';
import { SERVER_PORT } from '../constants/environment';
import { Eureka } from "eureka-js-client";

export default class CourseResource {
    public app: express.Application;
    public port: number;

    constructor() {
        this.app = express();
        this.app.use(express.json());
        this.port = SERVER_PORT;

        let eurekaClient = new Eureka({
            instance: {
                app: 'course-service',
                instanceId: 'course-service',
                hostName: 'localhost',
                ipAddr: '127.0.0.1',
                statusPageUrl: `http://localhost:${SERVER_PORT}`,
                healthCheckUrl: `http://localhost:${SERVER_PORT}/health`,
                port: {
                    '$': SERVER_PORT,
                    '@enabled': true
                },
                vipAddress: 'sn-course-service',
                dataCenterInfo: {
                    '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
                    'name': 'MyOwn'
                },
            },
            eureka: {
                host: 'localhost',
                port: 8761,
                servicePath: '/eureka/apps'
            }
        });

        eurekaClient.start();
        process.on('SIGINT', () => {
            // this.app.close();
            eurekaClient.stop();
        });
    }

    start(callback: Function) {
        this.app.listen(this.port, () => callback());
    }
}