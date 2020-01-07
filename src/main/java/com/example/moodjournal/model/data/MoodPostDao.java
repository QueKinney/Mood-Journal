package com.example.moodjournal.model.data;

import com.example.moodjournal.model.MoodPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MoodPostDao extends CrudRepository<MoodPost, Integer> {
}
