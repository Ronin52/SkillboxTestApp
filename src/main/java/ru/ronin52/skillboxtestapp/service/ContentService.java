package ru.ronin52.skillboxtestapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ronin52.skillboxtestapp.dto.ContentDto;
import ru.ronin52.skillboxtestapp.mapper.ContentMapper;
import ru.ronin52.skillboxtestapp.repository.ContentRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContentService {
    private final ContentMapper mapper;
    private final ContentRepository repository;

    public void save(ContentDto dto) {
        log.info("Incoming content {}", dto);
        repository.save(mapper.map(dto));
    }
}
