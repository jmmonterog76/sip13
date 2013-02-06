package com.springinpractice.ch13.helpdesk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.springinpractice.ch13.helpdesk.model.TicketEntity;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@RestResource(path = "tickets")
public interface TicketRepository extends JpaRepository<TicketEntity, Long> {	
}
