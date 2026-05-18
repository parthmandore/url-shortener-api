package com.parth.urlshortener.controller;

import com.parth.urlshortener.dto.UrlRequest;
import com.parth.urlshortener.entity.ShortUrl;
import com.parth.urlshortener.service.UrlService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/urls")
@RequiredArgsConstructor
public class UrlController {

    private final UrlService service;

    @PostMapping
    public ShortUrl createShortUrl(
            @Valid @RequestBody UrlRequest request
    ) {

        return service.createShortUrl(request.getUrl());
    }
}