package com.mahendra.exceptions;

public class InvalidPathForExcelException extends InvalidPathForFilesException {
    /**
     * @param message Details about the exception or custom message
     */
    public InvalidPathForExcelException(String message) {
        super(message);
    }

    /**
     * @param message Details about the exception or custom message
     * @param cause Pass the enriched stacktrace or customised stacktrace
     */
    public InvalidPathForExcelException(String message, Throwable cause) {
        super(message,cause);
    }
}
