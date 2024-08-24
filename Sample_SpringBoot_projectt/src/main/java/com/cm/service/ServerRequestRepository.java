package com.cm.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.beans.ServerRequest;

public interface ServerRequestRepository extends JpaRepository<ServerRequest, Long> {
}

