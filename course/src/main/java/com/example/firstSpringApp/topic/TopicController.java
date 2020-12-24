package com.example.firstSpringApp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/topics")
@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping()
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping()
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping ("/{id}")
    public void addTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic);
    }

    @DeleteMapping ("/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
