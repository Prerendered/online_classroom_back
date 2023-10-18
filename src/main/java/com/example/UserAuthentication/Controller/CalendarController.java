package com.example.UserAuthentication.Controller;

import com.example.UserAuthentication.Entity.Calendar;
import com.example.UserAuthentication.Service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/calendar")

public class CalendarController {
    @Autowired
    private CalendarService calendarServices;

    // save calendar post into database
    @PostMapping(value = "/save")
    public String saveCalendarDate(@RequestBody Calendar calendar) {
        calendarServices.save_Update(calendar);
        return calendar.get_id();
    }

    // get all calendar posts
    @GetMapping(value = "/getAll")
    public Iterable<Calendar> getForumPosts() {
        return calendarServices.listAll();
    }

    // update calendar post by id
    @PutMapping(value = "/edit/{id}")
    public Calendar updateCalendarDate(@RequestBody Calendar calendar, @PathVariable(name = "id") String _id) {
        calendar.set_id(_id);
        calendarServices.save_Update(calendar);
        return calendar;
    }

    // delete calendar post by id
    @DeleteMapping("/delete/{id}")
    public void deletetCalendarDate(@PathVariable("id") String _id) {
        calendarServices.deletetCalendarDate(_id);
    }

    // get calendar post by id
    @RequestMapping("/search/{id}")
    private Calendar getCalendarDate(@PathVariable(name = "id") String calendarID) {
        return calendarServices.getCalendarDateById(calendarID);
    }

    // check if calendar post exists by id
    @RequestMapping("/exists/{id}")
    private boolean checkCalendarDateExists(@PathVariable(name = "id") String calendarID) {
        return calendarServices.checkCalendarDateExists(calendarID);
    }
}
