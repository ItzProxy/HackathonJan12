package com.vivvo.userservice;

import com.vivvo.userservice.core.Sample.SampleValidator;
import org.junit.Before;
import org.junit.Test;

public class SampleValidatorTest {

    private SampleValidator sampleValidator;

    @Before
    public void before() {
      /*
        SampleRepository mockSampleRepository = mock(SampleRepository.class);
        when(mockSampleRepository.existsByUsername(anyString())).thenReturn(false);
        userValidator = new UserValidator(mockSampleRepository);
      */
    }

    @Test
    public void testWithMock_shouldSucceed() {
      /*
        SampleDto dto = newValidUserForCreate();

        SampleRepository mockSampleRepository = mock(SampleRepository.class);
        when(mockSampleRepository.existsByUsername(anyString())).thenReturn(true);
        userValidator = new UserValidator(mockSampleRepository);

        Map<String, String> validationErrors = userValidator.validate(dto);
        assertEquals(1, validationErrors.size());
        assertNotNull(validationErrors.get("username"));
        */
    }




}
