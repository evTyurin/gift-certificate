package com.epam.esm.controller.constants;

public enum ExceptionInfo {
    NAME_CERTIFICATE_SIZE("name.certificate.size.message", 40101),
    DESCRIPTION_SIZE("description.size.message", 40102),
    NOT_POSITIVE_DURATION("not.positive.duration.message", 40103),
    NOT_POSITIVE_PRICE("not.positive.price.message", 40104),
    NAME_TAG_SIZE("name.tag.size.message", 40105),
    BLANK_FIELD("blank.field.message", 40106),
    NOT_POSITIVE_USER_ID("not.positive.user.id.message", 40107);

    private final String exceptionMessage;
    private final int exceptionCode;

    ExceptionInfo(String exceptionMessage, int exceptionCode) {
        this.exceptionMessage = exceptionMessage;
        this.exceptionCode = exceptionCode;
    }

    public static int getExceptionCodeByMessage(String message) {
        for (ExceptionInfo exceptionInfo : ExceptionInfo.values()) {
            if (exceptionInfo.exceptionMessage.equals(message)) {
                return exceptionInfo.exceptionCode;
            }
        }
        return 0;
    }
}