package com.gtu.translatednotification.service;

import com.gtu.translatednotification.model.Language;
import com.gtu.translatednotification.model.dao.Translation;

import java.util.List;
import java.util.Optional;

public interface ITranslationService {
    List<Language> getSupportedLanguages();
    List<Translation> get();
    Optional<Translation> translate(Translation translation);
}
