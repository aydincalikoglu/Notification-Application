package com.gtu.translatednotification.repository;

import com.gtu.translatednotification.model.dao.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface NoteRepo extends JpaRepository<Note, Long> {

}
