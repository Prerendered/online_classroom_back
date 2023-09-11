package com.example.UserAuthentication.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.UserAuthentication.Entity.Topic;
import com.example.UserAuthentication.Service.TopicService;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/v2/topics")
public class TopicController {

    @Autowired
    private TopicService TopicServices;

    @PostMapping(value= "/save")
    public String saveTopic(@RequestBody Topic Topics)
    {
        TopicServices.save_Update(Topics);
        return  Topics.getTopicName();
    }

    @GetMapping(value= "/getAll")
    public Iterable <Topic>getTopics()
    {
        return TopicServices.listAll();
    }

    @PutMapping(value= "/edit/{id}")
    public Topic update(@RequestBody Topic Topic,@PathVariable(name="id") String _id)
    {
        Topic.set_id(_id);
        TopicServices.save_Update(Topic);
        return Topic;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTopic(@PathVariable("id") String _id)
    {
        TopicServices.deleteTopic(_id);
    }

   @RequestMapping("/search/{id}")
   private Topic getTopic(@PathVariable(name="id") String Topicid)
   {
       return TopicServices.getTopicById(Topicid);
   }
    
}
