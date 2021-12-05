package com.beniregev.LanguageDictationApp.service;

import com.beniregev.LanguageDictationApp.model.Element;
import com.beniregev.LanguageDictationApp.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementService {

    @Autowired
    private ElementRepository elementRepository;

    public Element createElementDemo() {
        return null;
    }

    public Element createElement(String requestBody) {
        Element elementToCreate = new Element();
        Element elementCreated = elementRepository.save(elementToCreate);
        return elementCreated;
    }

    public List<Element> getAllElements() {
        return elementRepository.findAll();
    }

    public Element getElementById(String id) {
        return elementRepository.findById(Integer.parseInt(id)).orElse(null);
    }

}
