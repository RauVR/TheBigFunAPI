package com.crackelets.bigfun.platform.booking.domain.persistence;

import com.crackelets.bigfun.platform.booking.domain.model.EventAttendee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventAttendeeRepository extends JpaRepository<EventAttendee, Long> {

    Optional<EventAttendee> findByEventId(Long id);

}
