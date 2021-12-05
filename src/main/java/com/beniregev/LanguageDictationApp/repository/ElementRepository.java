package com.beniregev.LanguageDictationApp.repository;

import com.beniregev.LanguageDictationApp.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends JpaRepository<Element, Integer> {
}
