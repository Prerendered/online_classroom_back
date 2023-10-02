package com.example.UserAuthentication.Repo;

import com.example.UserAuthentication.Entity.Calendar;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalendarRepo extends MongoRepository<Calendar, String>
{

}