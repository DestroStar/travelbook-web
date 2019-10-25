package com.Kh033Java.travelbook.repository;

import com.Kh033Java.travelbook.entity.Transport;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransportRepository extends Neo4jRepository<Transport, Long> {

    List<Transport> findAll();

    Transport findByType(@Param("type") String type);
}
