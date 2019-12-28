package com.gtu.translatednotification.service.Impl;


import com.darkprograms.speech.translator.GoogleTranslate;
import com.gtu.translatednotification.model.Language;
import com.gtu.translatednotification.model.dao.Translation;
import com.gtu.translatednotification.repository.TranslationsRepo;
import com.gtu.translatednotification.service.ITranslationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Component
@Slf4j
public class TranslationService implements ITranslationService {

    @Autowired
    TranslationsRepo translationsRepo;

    @Override
    public List<Translation> get() {
        return translationsRepo.findAll();
    }

    public Optional<Translation> translate(Translation translation) {
        try {
            translation.setTarget(GoogleTranslate
                .translate(translation.getSourceLanguage(), translation.getTargetLanguage(), translation.getSource()));
            translationsRepo.save(translation);
        } catch (IOException e) {
            log.warn("can not translate :" + translation, e);
            return Optional.empty();
        }
        return Optional.of(translation);
    }

    public List<Language> getSupportedLanguages() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("empty.txt").getFile());
        try {
            return FileUtils.readLines(file, "UTF-8").stream()
                .map(line -> line.split("\t"))
                .map(columns -> new Language(columns[0], columns[1]))
                .collect(Collectors.toList());
        } catch (IOException e) {
            log.error("Can not read Languages");
            return new ArrayList<>();
        }
    }

}
