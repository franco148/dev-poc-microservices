using System;
using System.Collections.Generic;

namespace sn_schedule_service.Models
{
    public class Schedule
    {
        public Guid id { get; set; }
        public DateTime startTime { get; set; }
        public DateTime endTime { get; set; }
        public List<string> days { get; set; }
        public Guid studentId { get; set; }
        public Guid courseId { get; set; }
    }
}