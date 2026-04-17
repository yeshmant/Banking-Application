package com.Banking_Application.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import com.Banking_Application.dto.GeolocationResponse;

public interface GeolocationService {

    @Async
    public CompletableFuture<GeolocationResponse> getGeolocation(String ip);
}
