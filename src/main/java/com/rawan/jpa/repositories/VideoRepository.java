package com.rawan.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rawan.jpa.model.Video;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {

}
