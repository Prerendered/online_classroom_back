package com.example.UserAuthentication.Service;

import com.example.UserAuthentication.Entity.Calendar;
import com.example.UserAuthentication.Repo.CalendarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CalendarService
{
    @Autowired
    private CalendarRepo repo;

    public void save_Update(Calendar cal)
    {
        repo.save(cal);
    }

    public Iterable<Calendar> listAll()
    {
        return this.repo.findAll();
    }

    public void deleteCalendar(String id)
    {
        repo.deleteById(id);
    }


    // delete
    public void deletetCalendarDate(String id)
    {
        repo.deleteById(id);
    }

    // get by id
    public Calendar getCalendarDateById(String id)
    {
        return repo.findById(id).get();
    }

    // check if exists
    public boolean checkCalendarDateExists(String id)
    {
        return repo.existsById(id);
    }


}