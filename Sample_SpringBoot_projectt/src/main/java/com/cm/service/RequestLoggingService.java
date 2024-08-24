package com.cm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.beans.ServerRequest;

import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Service
public class RequestLoggingService {

    @Autowired
    private ServerRequestRepository serverRequestRepository;

    public void logRequest(HttpServletRequest request, String requestBody) {
        ServerRequest serverRequest = new ServerRequest();
        serverRequest.setIpAddress(request.getRemoteAddr());
        serverRequest.setRequestBody(requestBody);
        serverRequest.setRequestMethod(request.getMethod());
        serverRequest.setTimestamp(LocalDateTime.now());

        serverRequestRepository.save(serverRequest);
    }
}
