using System;
using System.Collections.Generic;

namespace sn_schedule_service.Models
{
    public class Schedule
    {
        public Guid Id { get; set; }
        public DateTime StartTime { get; set; }
        public DateTime EndTime { get; set; }
        public List<string> Days { get; set; }
        public Guid StudentId { get; set; }
        public Guid CourseId { get; set; }
    }
}