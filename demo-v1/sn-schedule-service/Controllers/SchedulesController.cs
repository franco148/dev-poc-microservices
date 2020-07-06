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
        private IEnumerable<Schedule> _schedulesList;

        public SchedulesController(IConfiguration config) {
            _config = config;
        }

        [HttpGet]
        public ActionResult<IEnumerable<Schedule>> Get()
        {
            Schedule schedule = new Schedule();
            Console.WriteLine("Calling Schedules Service...");

            // return new Schedule[] { schedule };
            return Ok(_schedulesList);
        }

        #region Helpers

        #endregion
    }
}