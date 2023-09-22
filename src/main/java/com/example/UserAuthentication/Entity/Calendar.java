package com.example.UserAuthentication.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Calendar")

public class Calendar
{
    @Id
    private String _id;

    private String date;

    private String message;


public Calendar(String _id, String date, String message)
    {
        this._id = _id;
        this.date = date;
        this.message = message;
    }

    public String get_id()
    {
        return _id;
    }

    public void set_id(String _id)
    {
        this._id = _id;
    }

    public String get_message()
    {
        return message;
    }

    public void set_message(String message)
    {
        this.message = message;
    }

    public String get_date()
    {
        return date;
    }

    public void set_date(String date)
    {
        this.date = date;
    }

    

    @Override
    public String toString()
    {
        return "Calendar{" + "_id='" + _id + '\'' + ", message='" + message + '\'' + ", date='" + date  + '\'' + '}';
    }

}