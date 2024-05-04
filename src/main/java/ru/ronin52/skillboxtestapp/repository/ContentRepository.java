package ru.ronin52.skillboxtestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ronin52.skillboxtestapp.entity.ContentEntity;

public interface ContentRepository extends JpaRepository<ContentEntity, Long> {
}
