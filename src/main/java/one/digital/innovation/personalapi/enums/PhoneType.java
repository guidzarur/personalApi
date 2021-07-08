package one.digital.innovation.personalapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME ("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

//    PhoneType(String description) {
//        this.description = description;
//    }

    private final String description;
}