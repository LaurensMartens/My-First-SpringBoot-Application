package com.example.firstSpringApp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

    public List<Topic> getAllTopics() {
        List<Topic> topicList = new ArrayList<>();
        topicRepo.findAll().forEach(n -> topicList.add(n));
        return topicList;
    }

    public Topic getTopic(String id) {
        return topicRepo.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepo.save(topic);
    }

    public void updateTopic(Topic topic) {
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepo.deleteById(id);
    }
}
