package io.javabrains.springbootstarter.topic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	public TopicRepository topicRepository;
	
	//public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
		//	 new Topic("Java", "Core Java", "Core Java Description")));
	
	public List<Topic> getAllTopic()
	{
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics :: add);
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		Optional<Topic> topic = topicRepository.findById(id);
		return topic.get();
	}
	
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t-> t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}

}
