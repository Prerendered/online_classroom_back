package com.example.UserAuthentication.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Topics")
public class Topic {
    @Id
    private String _id;
    private String SubjectName;
    private String TopicName;
    private String videoID;
    private String TopicCompletion;

    public Topic(String _id, String SubjectName, String TopicName, String videoID, String TopicCompletion) {
        this._id = _id;
        this.SubjectName = SubjectName;
        this.TopicName = TopicName;
        this.videoID = videoID;
        this.TopicCompletion = TopicCompletion;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public void setVideoID(String videoID){
        this.videoID = videoID;
    }

    public String getVideoID(){
        return videoID;
    }

    public String getTopicCompletion() {
        return TopicCompletion;
    }

    public void setTopicCompletion(String TopicCompletion) {
        this.TopicCompletion = TopicCompletion;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "_id='" + _id + '\'' +
                ", TopicName='" + SubjectName + '\'' +
                ", TopicName='" + TopicName + '\'' +
                ", videoID='" + videoID + '\'' +
                ", TopicCompletion='" + TopicCompletion + '\'' +
                '}';
    }
}
