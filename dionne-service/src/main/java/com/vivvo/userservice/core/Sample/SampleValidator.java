package com.vivvo.userservice.core.Sample;

import com.vivvo.userservice.SampleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class SampleValidator {

    private final SampleRepository sampleRepository;

    @Autowired
    public SampleValidator(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public Map<String, String> validate(SampleDto sampleDto) {
        Map<String, String> validationErrors = new LinkedHashMap<>();
        return validationErrors;
    }
}
