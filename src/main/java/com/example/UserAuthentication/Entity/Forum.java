package com.example.UserAuthentication.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Forum")

public class Forum
{
    @Id
    private String _id;

    private String title;

    private String category;

    private String question;

    private String answer;

    private String date;

    private String user;

public Forum(String _id, String title, String category, String question, String answer, String date, String user)
    {
        this._id = _id;
        this.title = title;
        this.category = category;
        this.question = question;
        this.answer = answer;
        this.date = date;
        this.user = user;
    }

    public String get_id()
    {
        return _id;
    }

    public void set_id(String _id)
    {
        this._id = _id;
    }

    public String get_title()
    {
        return title;
    }

    public void set_title(String title)
    {
        this.title = title;
    }

    public String get_category()
    {
        return category;
    }

    public void set_category(String category)
    {
        this.category = category;
    }

    public String get_question()
    {
        return question;
    }

    public void set_question(String question)
    {
        this.question = question;
    }

    public String get_answer()
    {
        return answer;
    }

    public void set_answer(String answer)
    {
        this.answer = answer;
    }

    public String get_date()
    {
        return date;
    }

    public void set_date(String date)
    {
        this.date = date;
    }

    public String get_user()
    {
        return user;
    }

    public void set_user(String user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "Forum{" + "_id='" + _id + '\'' + ", title='" + title + '\'' + ", category='" + category + '\'' + ", question='" + question + '\'' + ", answer='" + answer + '\'' + ", date='" + date + '\'' + ", user='" + user + '\'' + '}';
    }


    public void setAnswer(String answer) {
    }
}
