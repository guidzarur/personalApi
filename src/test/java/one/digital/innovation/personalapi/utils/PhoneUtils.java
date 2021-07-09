package one.digital.innovation.personalapi.utils;

import one.digital.innovation.personalapi.dto.request.PhoneDTO;
import one.digital.innovation.personalapi.entity.Phone;
import one.digital.innovation.personalapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "54991743419";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
