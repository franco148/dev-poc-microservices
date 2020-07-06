using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using sn_schedule_service.Models;

namespace sn_schedule_service.Controllers
{
    [Route("[controller]")]
    [ApiController]
    public class SchedulesController : ControllerBase
    {
        private readonly IConfiguration _config;
        private IList<Schedule> _schedulesList;

        public SchedulesController(IConfiguration config) {
            _schedulesList = new List<Schedule>();
            _config = config;
            initializeScheduleInformation();
        }

        [HttpGet]
        public ActionResult<IEnumerable<Schedule>> Get()
        {
            Schedule schedule = new Schedule();
            Console.WriteLine("Calling Schedules Service...");

            // return new Schedule[] { schedule };
            return Ok(_schedulesList);
        }

        [HttpPost]
        public void Post([FromBody] Schedule schedule)
        {
            _schedulesList.Add(schedule);
        }

        #region Helpers
        private void initializeScheduleInformation() 
        {
            // Constants
            Guid studentFrancoId = Guid.Parse("1ffe2042-bf2e-11ea-b3de-0242ac130004");
            Guid studentJuanId = Guid.Parse("1ffe2420-bf2e-11ea-b3de-0242ac130004");
            Guid studentClaudiaId = Guid.Parse("1ffe24f2-bf2e-11ea-b3de-0242ac130004");

            Guid courseCalculoId = Guid.Parse("1ffe21b4-bf2e-11ea-b3de-0242ac130004");
            Guid courseProgrammingId = Guid.Parse("1ffe27cc-bf2e-11ea-b3de-0242ac130004");
            Guid courseEnglishId = Guid.Parse("1ffe292a-bf2e-11ea-b3de-0242ac130004");
            Guid courseArtificialIntelligenceId = Guid.Parse("1ffe2a06-bf2e-11ea-b3de-0242ac130004");
            Guid coursePhysicsId = Guid.Parse("1ffe2b46-bf2e-11ea-b3de-0242ac130004");

            Schedule scheduleFranco01 = new Schedule 
            {
                Id = Guid.Parse("1ffe1e44-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "MONDAY", "THRUSDAY"},
                StudentId = studentFrancoId,
                CourseId = courseCalculoId
            };
            Schedule scheduleFranco02 = new Schedule 
            {
                Id = Guid.Parse("1ffe22f4-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "TUESDAY", "WEDNESDAY"},
                StudentId = studentFrancoId,
                CourseId = courseProgrammingId
            };
            Schedule scheduleFranco03 = new Schedule 
            {
                Id = Guid.Parse("1ffe2cae-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "MONDAY", "FRIDAY"},
                StudentId = studentFrancoId,
                CourseId = courseEnglishId
            };
            Schedule scheduleFranco04 = new Schedule 
            {
                Id = Guid.Parse("1ffe2e02-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "TUESDAY", "THRUSDAY", "FRIDAY"},
                StudentId = studentFrancoId,
                CourseId = courseArtificialIntelligenceId
            };
            _schedulesList.Add(scheduleFranco01);
            _schedulesList.Add(scheduleFranco02);
            _schedulesList.Add(scheduleFranco03);
            _schedulesList.Add(scheduleFranco04);


            Schedule scheduleJuan01 = new Schedule 
            {
                Id = Guid.Parse("1ffe2f06-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "MONDAY", "THRUSDAY"},
                StudentId = studentJuanId,
                CourseId = courseCalculoId
            };
            Schedule scheduleJuan02 = new Schedule 
            {
                Id = Guid.Parse("1ffe3082-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "THRUSDAY", "FRIDAY", "SATURDAY"},
                StudentId = studentJuanId,
                CourseId = coursePhysicsId
            };
            _schedulesList.Add(scheduleJuan01);
            _schedulesList.Add(scheduleJuan02);


            Schedule scheduleClaudia01 = new Schedule 
            {
                Id = Guid.Parse("1ffe3172-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "TUESDAY", "WEDNESDAY"},
                StudentId = studentClaudiaId,
                CourseId = courseProgrammingId
            };
            Schedule scheduleClaudia02 = new Schedule 
            {
                Id = Guid.Parse("1ffe326c-bf2e-11ea-b3de-0242ac130004"),
                StartTime = DateTime.Now,
                EndTime = DateTime.Now,
                Days = new List<string> { "MONDAY", "FRIDAY"},
                StudentId = studentClaudiaId,
                CourseId = courseEnglishId
            };
            _schedulesList.Add(scheduleClaudia01);
            _schedulesList.Add(scheduleClaudia02);
        }
        #endregion
    }
}